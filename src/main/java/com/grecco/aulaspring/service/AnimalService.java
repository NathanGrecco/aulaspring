package com.grecco.aulaspring.service;

import com.grecco.aulaspring.model.Animal;
import com.grecco.aulaspring.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements EntityService<Animal> {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public void save(Animal entity) {
        animalRepository.save(entity);
    }

    @Override
    public List<Animal> buscarTodos() {
        return animalRepository.findAll();
    }
}
