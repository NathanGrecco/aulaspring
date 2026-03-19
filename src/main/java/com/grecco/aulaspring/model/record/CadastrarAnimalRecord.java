package com.grecco.aulaspring.model.record;

import com.grecco.aulaspring.model.Especie;

public record CadastrarAnimalRecord(String nome,
                                    Integer idade,
                                    Especie especie,
                                    Long tutorId) {
}
