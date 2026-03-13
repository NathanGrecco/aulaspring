package com.grecco.aulaspring.controller;

import com.grecco.aulaspring.model.Animal;
import com.grecco.aulaspring.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    public void salvarAnimal(@RequestBody Animal animal) {
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
