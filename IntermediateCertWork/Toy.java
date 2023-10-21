package IntermediateCertWork;

public class Toy {
    private int id;
    private String name;
    private int count;
    private double frequencyLoss;

    public Toy(int id, String name, int count, double frequencyLoss) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.frequencyLoss = frequencyLoss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getFrequencyLoss() {
        return frequencyLoss;
    }

    public void setFrequencyLoss(double frequencyLoss) {
        this.frequencyLoss = frequencyLoss;
    }
}
