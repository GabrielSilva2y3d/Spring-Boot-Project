package com.digitalinnovationone.desafio.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Occurrence {
    private long id;
    private String name;
    private String descricao;
}
