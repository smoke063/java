package oop_1;

import java.util.List;

public class HotVendingMachine extends BottleOfWaterVendingMachine implements VendingMachine {

    public HotVendingMachine(List<Product> products) {
        super(products);
    }

    public HotBottleOfWater getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotBottleOfWater) {
                if (product.getName().equalsIgnoreCase(name)
                        && ((BottleOfWater) product).getVolume() == volume
                        && ((HotBottleOfWater) product).getTemperature() == temperature
                ) {
                    return (HotBottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
