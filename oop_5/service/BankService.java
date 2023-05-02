package oop_5.service;

import oop_5.model.User;
import oop_5.repository.UseRepository;

public class BankService {

    private final UseRepository repository;

    public BankService() {
        this.repository = new UseRepository();
    }

    private User findUserByName(String name) {
        return this.repository.getAll().stream()
                .filter(x -> x.getName() == name)
                .findFirst()
                .orElse(null);
    }

    public void setBalanceForUserByName(Number balance, String name) {
        var user = this.findUserByName(name);
        if (user != null) {
            user.setBalance(balance);
        }
    }

    public void create(String name) {
        this.repository.create(new User(name, 18));
    }
}
