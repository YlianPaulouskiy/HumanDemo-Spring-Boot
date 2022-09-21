package edu.step.service.impl;

import edu.step.entity.Human;
import edu.step.repository.HumanRepository;
import edu.step.service.HumanService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@AllArgsConstructor
@Service
public class HumanServiceImpl implements HumanService {

    private final HumanRepository repository;

    @Override
    public Human findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Human not found")
        );
    }

    @Override
    public List<Human> findAll() {
        return repository.findAll();
    }

    @Override
    public Human save(Human human) {
        return repository.save(human);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
