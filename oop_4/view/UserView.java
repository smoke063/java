package oop_4.view;

import oop_4.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
