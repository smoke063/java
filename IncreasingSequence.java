import java.util.Scanner;

public class IncreasingSequence {
    public int[] inputSequence() {
        System.out.println("Введите количество элементов последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] ints = new int[number];
        int counter = 0;
        do {
            ints[counter] = scanner.nextInt();
            counter++;
        } while (counter < number);
        scanner.close();
        return ints;
    }

    public boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i-1]) return false;
        return true;
    }
}
