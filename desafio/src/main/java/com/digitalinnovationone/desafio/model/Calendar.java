package com.digitalinnovationone.desafio.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Calendar {
    private Long id;
    private String descricao;
    private LocalDateTime specialDate;
    private TypeDate typeDate;
    
}
