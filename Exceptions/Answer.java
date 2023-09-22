package Exceptions;

public class Answer {

    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] nums = new int[]{1, 2, 3, 5};
        for (int i = 0; i < 5; i++) {
            int n = nums[i];
        }
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int n = 10;
        int r = n / 0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "er";
        int i = Integer.parseInt(str);
    }

    public int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже

        if (a.length != b.length) {
            return new int[]{0};
        }

        // Введите свое решение ниже
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] / b[i];
        }
        return res;
    }

    public int[] subArrays(int[] a, int[] b) {

        if (a.length != b.length) {
            return new int[]{0};
        }

        // Введите свое решение ниже
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] - b[i];
        }
        return res;
    }
}
