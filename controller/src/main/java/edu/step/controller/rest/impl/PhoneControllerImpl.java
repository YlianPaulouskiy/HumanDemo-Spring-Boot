package edu.step.controller.rest.impl;

import edu.step.controller.rest.PhoneController;
import edu.step.entity.Phone;
import edu.step.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/phones")
public class PhoneControllerImpl implements PhoneController {

    private final PhoneService phoneService;

    @Override
    public Phone findOne(Long id) {
        return phoneService.findOne(id);
    }

    @Override
    public List<Phone> findAll() {
        return phoneService.findAll();
    }

    @Override
    public Phone save(Phone phone) {
        return phoneService.save(phone);
    }

    @Override
    public void remove(Long id) {
        phoneService.remove(id);
    }
}
