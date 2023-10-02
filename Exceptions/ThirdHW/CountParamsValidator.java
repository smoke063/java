package Exceptions.ThirdHW;

public class CountParamsValidator {
    private final int COUNT = 6;

    public String getMessage(int count) {
        String str = "";
        if (count < this.COUNT) {
            str = String.format("Вы ввели %d меньше параметров, чем нужно. Нужно %d!", count, this.COUNT);
        }
        if (count > this.COUNT) {
            str = String.format("Вы ввели %d больше параметров, чем нужно. Нужно %d!", count, this.COUNT);
        }
        return str;
    }

    public boolean isCountValid(int count) {
        return count == this.COUNT;
    }
}
