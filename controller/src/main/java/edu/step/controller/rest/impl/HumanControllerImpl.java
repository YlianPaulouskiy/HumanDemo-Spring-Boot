package edu.step.controller.rest.impl;

import edu.step.controller.rest.HumanController;
import edu.step.entity.Human;
import edu.step.service.HumanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/humans")
public class HumanControllerImpl implements HumanController {

    private final HumanService service;

    @Override
    public Human findOne(Long id) {
        return service.findOne(id);
    }

    @Override
    public List<Human> findAll() {
        return service.findAll();
    }

    @Override
    public Human save(Human human) {
        return service.save(human);
    }

    @Override
    public void remove(Long id) {
        service.remove(id);
    }
}
