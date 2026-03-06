package com.grecco.aulaspring.controller;

import com.grecco.aulaspring.model.Tutor;
import com.grecco.aulaspring.service.TutorService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    public void salvarTuto(Tutor tutor) {
        tutorService.save(tutor);
    }

    public List<Tutor> buscarTodosTutores() {
        return tutorService.buscarTodos();
    }
}
