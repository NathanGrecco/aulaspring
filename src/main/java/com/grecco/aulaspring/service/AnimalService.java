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
        validaAnimal(entity);
        animalRepository.save(entity);
    }

    @Override
    public List<Animal> buscarTodos() {
        return animalRepository.findAll();
    }

    @Override
    public void delete(Long id) {

        if (id == null) {
            throw new RuntimeException("Id deve ser preenchido");
        }

        animalRepository.deleteById(id);
    }

    @Override
    public void update(Animal entity) {
        validaAnimal(entity);
        animalRepository.save(entity);
    }

    private void validaAnimal(Animal entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Nome deve ser preenchido");
        }

        if (entity.getEspecie() == null) {
            throw new RuntimeException("Especie deve ser preenchido");
        }

        if (entity.getIdade() == null) {
            throw new RuntimeException("Idade deve ser preenchido");
        }

        if (entity.getTutor() == null) {
            throw new RuntimeException("Tutor deve ser preenchido");
        }

    }
}
