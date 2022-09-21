package edu.step.controller.rest.parent;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController<T> {

    @GetMapping("/find")
    T findOne(@RequestParam Long id);

    @GetMapping("/all")
    List<T> findAll();

    @PostMapping("/save")
    T save(@RequestBody T entity);

    @DeleteMapping("/remove")
    void remove(@RequestParam Long id);

}
