package edu.step.controller.web.impl;

import edu.step.controller.web.IndexController;
import edu.step.entity.Human;
import edu.step.service.HumanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/human")
public class IndexControllerImpl implements IndexController {

    private final HumanService humanService;

    public IndexControllerImpl(HumanService humanService) {
        this.humanService = humanService;
    }

    @Override
    public String index(ModelMap modelMap) {
        List<Human> humanList = humanService.findAll();
        modelMap.addAttribute("humanList", humanList);
        return "index";
    }

}
