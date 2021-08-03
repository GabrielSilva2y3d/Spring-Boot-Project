package com.digitalinnovationone.desafio.model;

import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class Location {
    @Id
    private long id;
    private String descricao;
    @ManyToOne 
    private AccessLevel accessLevel;
    
}
