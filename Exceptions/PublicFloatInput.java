package Exceptions;

import java.io.IOException;
import java.util.Scanner;


public class PublicFloatInput {
    public static void inputFloat() throws IOException {
        System.out.println("Введите дробное число:");

        Scanner in = null;
        try {
            in = new Scanner(System.in);
            float b = in.nextFloat();
            System.out.println("Вы ввели число:  " + b);
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
            PublicFloatInput.inputFloat();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}