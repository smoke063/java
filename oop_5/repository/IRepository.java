package oop_5.repository;

import java.util.List;

public interface IRepository<T> {
    T getById(String id);

    List<T> getAll();

    void create(T entity);

    void update(T entity);

    void remove(String id);

}
