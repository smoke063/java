package oop_6.view;

import oop_6.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
