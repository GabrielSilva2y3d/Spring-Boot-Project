package com.digitalinnovationone.desafio.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Builder
@Entity
public class Calendar {
    @Id
    private Long id;
    private String descricao;
    private LocalDateTime specialDate;
    @ManyToOne
    private TypeDate typeDate;
    
}
