package oop_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BottleOfWaterVendingMachineTest {

    private List<Product> products;
    private HotVendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        this.products = new ArrayList<>();
        this.vendingMachine = new HotVendingMachine(products);
    }

    @Test
    void getProductTestSuccessful() {
        // expected
        products.add(new BottleOfWater("ExampleName1", 1.0d, 1000));
        products.add(new BottleOfWater("ExampleName2", 2.0d, 500));

        products.add(new HotBottleOfWater("ExampleName3", 1.0d, 1000, 100));
        products.add(new HotBottleOfWater("ExampleName4", 2.0d, 500, 60));

        this.vendingMachine = new HotVendingMachine(products);

        BottleOfWater expected = new BottleOfWater("ExampleName2", 2.0d, 500);

        HotBottleOfWater expectedHot = new HotBottleOfWater("ExampleName4", 2.0d, 500, 60);

        // actual
        BottleOfWater actual = vendingMachine.getProduct("ExampleName2", 500);

        HotBottleOfWater actualHot = vendingMachine.getProduct("ExampleName4", 500, 60);

        Assertions.assertEquals(expected, actual);

        Assertions.assertEquals(expectedHot, actualHot);
    }
}