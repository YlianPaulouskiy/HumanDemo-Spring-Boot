package edu.step.controller.web.impl;

import edu.step.controller.web.IndexController;
import edu.step.entity.Person;
import edu.step.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/human")
public class IndexControllerImpl implements IndexController {

    private final PersonService personService;

    public IndexControllerImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public String index(ModelMap modelMap) {
        List<Person> humanList = personService.findAll();
        modelMap.addAttribute("humanList", humanList);
        return "index";
    }

}
