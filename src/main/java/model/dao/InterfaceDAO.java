package model.dao;

import java.util.List;

public interface InterfaceDAO<T> {
    void create(T t);
    List<T> findAll();
    void update(T t);
    void delete(T t);
}
