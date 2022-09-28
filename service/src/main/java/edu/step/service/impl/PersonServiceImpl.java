package edu.step.service.impl;

import edu.step.dto.PersonDto;
import edu.step.entity.Person;
import edu.step.mapper.PersonMapper;
import edu.step.repository.PersonRepository;
import edu.step.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;
    private final PersonMapper personMapper;

    @Override
    public PersonDto findOne(Long id) {
        return personMapper.convert(
                repository.findById(id).orElseThrow(
                        () -> new EntityNotFoundException("Human not found")
                )
        );
    }

    @Override
    public List<PersonDto> findAll() {
        return personMapper.convertToPersonDtoList(repository.findAll());
    }

    @Override
    public PersonDto save(PersonDto human) {
        return personMapper.convert(repository.save(personMapper.convert(human)));
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
