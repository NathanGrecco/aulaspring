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
        validaTutor(entity);
        tutorRepository.save(entity);
    }

    @Override
    public List<Tutor> buscarTodos() {
        return tutorRepository.findAll();
    }

    @Override
    public void delete(Long id) {

        if (id == null) {
            throw new RuntimeException("Id deve ser preenchido");
        }

        tutorRepository.deleteById(id);
    }

    @Override
    public void update(Tutor entity) {
        validaTutor(entity);
        tutorRepository.save(entity);
    }

    private void validaTutor(Tutor entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Nome deve ser preenchido");
        }

        if (entity.getCpf() == null) {
            throw new RuntimeException("Cpf deve ser preenchido");
        }

        if (entity.getIdade() == null) {
            throw new RuntimeException("Idade deve ser preenchido");
        }

        if (entity.getEndereco() == null) {
            throw new RuntimeException("Endereço deve ser preenchido");
        }

        if (entity.getDataNascimento() == null) {
            throw new RuntimeException("Data de nascimento deve ser preenchido");
        }
    }
}
