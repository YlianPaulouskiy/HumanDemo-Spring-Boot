package edu.step.service.impl;

import edu.step.dto.AddressDto;
import edu.step.mapper.AddressMapper;
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
    private final AddressMapper addressMapper;

    @Override
    public AddressDto findOne(Long id) {
        return addressMapper.convert(
                addressRepository.findById(id).orElseThrow(
                        () -> new EntityNotFoundException("Address " + id + " not founded")
                )
        );
    }

    @Override
    public List<AddressDto> findAll() {
        return addressMapper.convertToAddressDtoList(addressRepository.findAll());
    }

    @Override
    public AddressDto save(AddressDto entity) {
        return addressMapper.convert(addressRepository.save(addressMapper.convert(entity)));
    }

    @Override
    public void remove(Long id) {
        addressRepository.deleteById(id);
    }
}
