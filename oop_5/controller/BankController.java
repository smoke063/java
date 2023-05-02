package oop_5.controller;

import oop_5.service.BankService;

public class BankController {

    private final BankService service;

    public BankController() {
        this.service = new BankService();
    }

    public void saveNewUser(String name) {
        service.create(name);
    }

    public void setBalanceForUserByName(Number balance, String name) {
        service.setBalanceForUserByName(balance, name);

    }
}
