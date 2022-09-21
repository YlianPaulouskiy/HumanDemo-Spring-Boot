package edu.step.controller.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public interface IndexController {

    @GetMapping
    String index(ModelMap modelMap);
}
