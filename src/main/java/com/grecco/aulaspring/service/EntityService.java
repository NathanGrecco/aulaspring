package com.grecco.aulaspring.service;

import java.util.List;

public interface EntityService<T> {

    void save(T entity);
    List<T> buscarTodos();
}
