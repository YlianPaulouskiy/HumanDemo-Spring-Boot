package edu.step.controller.rest.impl;

import edu.step.controller.rest.PersonController;
import edu.step.entity.Person;
import edu.step.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/humans")
public class PersonControllerImpl implements PersonController {

    private final PersonService service;

    @Override
    public Person findOne(Long id) {
        return service.findOne(id);
    }

    @Override
    public List<Person> findAll() {
        return service.findAll();
    }

    @Override
    public Person save(Person human) {
        return service.save(human);
    }

    @Override
    public void remove(Long id) {
        service.remove(id);
    }
}
