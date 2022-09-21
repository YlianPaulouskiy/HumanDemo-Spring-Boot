package edu.step.service.parent;


import java.util.List;

public interface CommonService<T> {

    T findOne(Long id);

    List<T> findAll();

    T save(T entity);

    void remove(Long id);
}
