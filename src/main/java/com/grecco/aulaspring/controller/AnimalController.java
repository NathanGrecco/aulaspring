package com.grecco.aulaspring.controller;

import com.grecco.aulaspring.model.Animal;
import com.grecco.aulaspring.service.AnimalService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    public void salvarAnimal(Animal animal) {
        animalService.save(animal);
    }

    public List<Animal> buscarTodosAnimais() {
        return animalService.buscarTodos();
    }
}
