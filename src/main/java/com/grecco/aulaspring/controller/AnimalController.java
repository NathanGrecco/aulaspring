package com.grecco.aulaspring.controller;

import com.grecco.aulaspring.model.Animal;
import com.grecco.aulaspring.model.Tutor;
import com.grecco.aulaspring.model.record.CadastrarAnimalRecord;
import com.grecco.aulaspring.service.AnimalService;
import com.grecco.aulaspring.service.TutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalService animalService;
    private final TutorService tutorService;

    public AnimalController(AnimalService animalService, TutorService tutorService) {
        this.animalService = animalService;
        this.tutorService = tutorService;
    }

    @PostMapping
    public void salvarAnimal(@RequestBody CadastrarAnimalRecord record) {
        Tutor tutor = tutorService.buscarTutorPorId(record.tutorId());
        Animal animal = Animal.builder()
                .nome(record.nome())
                .idade(record.idade())
                .especie(record.especie().getDescricao())
                .tutor(tutor)
                .build();

        animalService.save(animal);
    }

    @GetMapping
    public List<Animal> buscarTodosAnimais() {
        return animalService.buscarTodos();
    }

    @PostMapping("/atualizar")
    public void atualizarAnimal(@RequestBody Animal entity) {
        animalService.update(entity);
    }

    @DeleteMapping("/{id}")
    public void apagarAnimalPorId(@PathVariable Long id) {
        animalService.delete(id);
    }
}
