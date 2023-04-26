package oop_2;

public class Notebook extends Product {

    private final Integer memory;

    public Notebook(String name, Integer price, Integer memory) {
        super(name, price);
        this.memory = memory;
    }

    public Integer getMemory() {
        return this.memory;
    }

    @Override
    public void display() {
        System.out.printf("name: %s, price %d.%n", this.getName(), this.getPrice());
    }
}
