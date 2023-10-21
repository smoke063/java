package IntermediateCertWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private final List<Toy> winnings = new ArrayList();
    private final String filename = "toys.dat";
    private List<Toy> toys = new ArrayList();

    public ToyStore() {
        loadToys();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void addToys(Toy toy) {
        this.toys.add(toy);
        saveToys();
    }

    public void addWin(Toy toy) {
        this.winnings.add(toy);
        saveToys();
    }

    public void editToyFrequency(int id, double frequency) {
        for (Toy t : this.toys) {
            if (t.getId() == id) {
                t.setFrequencyLoss(frequency);
                break;
            }
        }
        saveToys();
    }

    public void saveToys() {
        try {
            File file = new File(filename);
            if (file.exists()) {
                FileOutputStream stream = new FileOutputStream(filename);
                ObjectOutputStream outStream = new ObjectOutputStream(stream);
                outStream.writeObject(this.toys);
                stream.close();
                outStream.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadToys() {
        try {
            File file = new File(filename);
            if (file.exists()) {
                FileInputStream stream = new FileInputStream(filename);
                ObjectInputStream inputStream = new ObjectInputStream(stream);
                this.toys = (List<Toy>) inputStream.readObject();
                stream.close();
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
