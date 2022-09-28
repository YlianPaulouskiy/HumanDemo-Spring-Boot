package edu.step.service.impl;

import edu.step.entity.Person;
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

    @Override
    public Person findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Human not found")
        );
    }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public Person save(Person human) {
        return repository.save(human);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
