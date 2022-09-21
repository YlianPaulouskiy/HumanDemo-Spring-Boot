package edu.step.service.impl;

import edu.step.entity.Phone;
import edu.step.repository.PhoneRepository;
import edu.step.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@AllArgsConstructor
@Service
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    @Override
    public Phone findOne(Long id) {
        return phoneRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Phone " + id + " not founded")
        );
    }

    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone save(Phone human) {
        return phoneRepository.save(human);
    }

    @Override
    public void remove(Long id) {
        phoneRepository.deleteById(id);
    }
}
