package IntermediateCertWork;

import java.util.Random;

public class PlayToy {

    public void run() {
        Toy toy = play();
        if (toy == null) {
            System.out.println("Все призы разыграны!");
        } else {
            System.out.println("Вы выиграли " + toy.getName());
            ToyStore toyStore = new ToyStore();
            toyStore.addWin(toy);
        }
    }

    public Toy play() {

        ToyStore toyStore = new ToyStore();
        Random random = new Random();
        toyStore.addToys(new Toy(1, "Name 1", 3, random.nextDouble()));
        toyStore.addToys(new Toy(2, "Name 2", 2, random.nextDouble()));
        toyStore.addToys(new Toy(3, "Name 3", 1, random.nextDouble()));
        toyStore.addToys(new Toy(4, "Name 4", 5, random.nextDouble()));
        toyStore.addToys(new Toy(5, "Name 5", 4, random.nextDouble()));
        toyStore.addToys(new Toy(6, "Name 6", 3, random.nextDouble()));
        toyStore.addToys(new Toy(7, "Name 7", 2, random.nextDouble()));
        toyStore.addToys(new Toy(8, "Name 8", 1, random.nextDouble()));


        double totalFrequency = 0;
        for (Toy toy : toyStore.getToys()) {
            totalFrequency += toy.getFrequencyLoss();
        }

        double randomFrequency = random.nextDouble() * totalFrequency;
        double sum = 0;
        for (Toy toy : toyStore.getToys()) {
            sum += toy.getFrequencyLoss();
            if (randomFrequency <= sum) {
                toyStore.addWin(toy);
                toy.setCount(toy.getCount() - 1);
                toyStore.saveToys();
                return toy;
            }
        }
        return null;
    }
}
