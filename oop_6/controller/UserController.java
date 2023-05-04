package oop_6.controller;

import oop_6.data.User;

import java.time.LocalDate;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
