package com.grecco.aulaspring.model;

import java.time.LocalDate;

/**
 * Interface é contrato
 */
public interface Pessoa {

    String getNome();
    LocalDate getDataNascimento();
    String getCpf();
    void setNome(String nome);
}
