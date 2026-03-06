package com.grecco.aulaspring.service;

import com.grecco.aulaspring.model.Tutor;
import com.grecco.aulaspring.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService implements EntityService<Tutor> {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    @Override
    public void save(Tutor entity) {
        tutorRepository.save(entity);
    }

    @Override
    public List<Tutor> buscarTodos() {
        return tutorRepository.findAll();
    }
}
