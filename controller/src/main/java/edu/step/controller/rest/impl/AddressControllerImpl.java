package edu.step.controller.rest.impl;

import edu.step.controller.rest.AddressController;
import edu.step.entity.Address;
import edu.step.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressControllerImpl implements AddressController {

    private final AddressService addressService;

    @Override
    public Address findOne(Long id) {
        return addressService.findOne(id);
    }

    @Override
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @Override
    public Address save(Address entity) {
        return addressService.save(entity);
    }

    @Override
    public void remove(Long id) {
        addressService.remove(id);
    }
}
