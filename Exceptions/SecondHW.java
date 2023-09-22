package Exceptions;

import java.util.Scanner;

public class SecondHW {

    static public void Task4() {
        System.out.println("Введите строку:");

        Scanner in = null;
        try {
            in = new Scanner(System.in);
            String str = in.nextLine();
            if (str.trim().isEmpty()) {
                throw new Exception("Вы ввели пустую строку!");
            }

            System.out.println("Вы ввели строку:  " + str);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    static public void Task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    static public void Task2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
