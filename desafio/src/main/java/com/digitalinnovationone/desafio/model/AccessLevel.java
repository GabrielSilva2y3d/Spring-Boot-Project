package com.digitalinnovationone.desafio.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccessLevel {
    private long id;
    private String descricao;
}
