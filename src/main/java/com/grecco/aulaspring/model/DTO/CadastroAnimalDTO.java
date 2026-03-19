package com.grecco.aulaspring.model.DTO;

import com.grecco.aulaspring.model.Especie;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CadastroAnimalDTO {

    private String nome;
    private Integer idade;
    private Especie especie;
    private Long tutorId;
}
