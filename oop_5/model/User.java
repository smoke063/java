package oop_5.model;

import java.util.Objects;
import java.util.UUID;

public class User {
    private final String id;
    private String name;

    private Number age;

    private Number balance;

    public User(String name, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public Number getBalance() {
        return balance;
    }

    public void setBalance(Number balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User " +
                "id = '" + this.id + '\'' +
                "name = '" + this.getName() + '\'' +
                "age = '" + this.getAge().toString() + '\'' +
                ", balance = " + this.getBalance() +
                " ";
    }
}
