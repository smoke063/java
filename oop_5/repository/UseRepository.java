package oop_5.repository;

import oop_5.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UseRepository implements IRepository<User> {

    private final List<User> storage;

    public UseRepository() {
        this.storage = new ArrayList<>();
    }

    @Override
    public User getById(String id) {
        return this.storage.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAll() {
        return this.storage;
    }

    @Override
    public void create(User entity) {
        this.storage.add(entity);
    }

    @Override
    public void update(User entity) {
        var user = this.storage.stream()
                .filter(x -> x.getId() == entity.getId())
                .findFirst()
                .orElse(null);
        if (user != null) {
            user.setName(entity.getName());
            user.setAge(entity.getAge());
            user.setBalance(entity.getBalance());
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove(String id) {
        this.storage.removeIf(x -> x.getId() == id);
    }
}
