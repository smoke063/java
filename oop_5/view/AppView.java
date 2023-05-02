package oop_5.view;

import oop_5.controller.BankController;

import java.util.Scanner;

public class AppView {
    public static void main(String[] args) {
        BankController bankCtrl = new BankController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user data ...");
        var name = scanner.nextLine();
        bankCtrl.saveNewUser(name);

        System.out.println("Set balance ");
        var balance = scanner.nextInt();
        System.out.println("for user ");
        bankCtrl.setBalanceForUserByName(balance, scanner.nextLine());
    }
}
