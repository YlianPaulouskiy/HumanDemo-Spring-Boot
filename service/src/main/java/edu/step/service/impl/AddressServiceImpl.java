package edu.step.service.impl;

import edu.step.entity.Address;
import edu.step.repository.AddressRepository;
import edu.step.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Address findOne(Long id) {
        return addressRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Address " + id + " not founded")
        );
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address save(Address entity) {
        return addressRepository.save(entity);
    }

    @Override
    public void remove(Long id) {
        addressRepository.deleteById(id);
    }
}
