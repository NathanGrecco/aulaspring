package com.grecco.aulaspring.model;

import lombok.Getter;

@Getter
public enum Especie {
    MAMIFERO("Memífero"),
    AVE("Ave"),
    PEIXE("Peixe");

    private String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }
}
