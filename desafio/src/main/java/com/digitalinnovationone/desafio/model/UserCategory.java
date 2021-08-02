package com.digitalinnovationone.desafio.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCategory {
    private long id;
    private String descricao;
}
