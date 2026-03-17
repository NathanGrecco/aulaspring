package com.grecco.aulaspring.service;

import com.grecco.aulaspring.model.Animal;
import com.grecco.aulaspring.model.Tutor;
import com.grecco.aulaspring.repository.AnimalRepository;
import com.grecco.aulaspring.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService implements EntityService<Animal> {

    private final AnimalRepository animalRepository;
    private final TutorRepository tutorRepository;

    public AnimalService(AnimalRepository animalRepository,
                         TutorRepository tutorRepository) {
        this.animalRepository = animalRepository;
        this.tutorRepository = tutorRepository;
    }

    public void salvarComIdTutor(Animal entity, Long tutorId) {
        Optional<Tutor> tutorOptional = tutorRepository.findById(tutorId);
        tutorOptional.ifPresent(entity::setTutor);
        save(entity);
    }

    @Override
    private void save(Animal entity) {
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
