package com.grecco.aulaspring.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tutor implements Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Integer idade;
    private String telefone;
    private String endereco;

    @OneToMany(mappedBy = "tutor")
    private List<Animal> animais;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
