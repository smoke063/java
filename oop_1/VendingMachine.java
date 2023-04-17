package oop_1;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
