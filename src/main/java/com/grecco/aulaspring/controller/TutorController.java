package com.grecco.aulaspring.controller;

import com.grecco.aulaspring.model.Tutor;
import com.grecco.aulaspring.service.TutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutor")
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @PostMapping
    public void salvarTuto(@RequestBody Tutor tutor) {
        tutorService.save(tutor);
    }

    @GetMapping
    public List<Tutor> buscarTodosTutores() {
        return tutorService.buscarTodos();
    }

    @PostMapping("/atualizar")
    public void atualizarTutor(@RequestBody Tutor entity) {
        tutorService.update(entity);
    }

    @DeleteMapping("/{id}")
    public void apagarTutorPorId(@PathVariable Long id) {
        tutorService.delete(id);
    }
}
