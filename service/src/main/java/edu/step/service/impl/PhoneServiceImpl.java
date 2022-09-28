package edu.step.service.impl;

import edu.step.dto.PhoneDto;
import edu.step.entity.Phone;
import edu.step.mapper.PhoneMapper;
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
    private final PhoneMapper phoneMapper;

    @Override
    public PhoneDto findOne(Long id) {
        return phoneMapper.convert(
                phoneRepository.findById(id).orElseThrow(
                        () -> new EntityNotFoundException("Phone " + id + " not founded")
                )
        );
    }

    @Override
    public List<PhoneDto> findAll() {
        return phoneMapper.convertToPhoneDtoList(phoneRepository.findAll());
    }

    @Override
    public PhoneDto save(PhoneDto human) {
        return phoneMapper.convert(phoneRepository.save(phoneMapper.convert(human)));
    }

    @Override
    public void remove(Long id) {
        phoneRepository.deleteById(id);
    }
}
