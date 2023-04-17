package oop_1;

public class HotBottleOfWater extends BottleOfWater {

    private int temperature;

    public HotBottleOfWater(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                "volume='" + super.getVolume() + '\'' +
                ", temperature=" + this.getTemperature() + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof HotBottleOfWater that)) {
            return false;
        }

        return super.equals(o) && this.getTemperature() == that.getTemperature();
    }
}
