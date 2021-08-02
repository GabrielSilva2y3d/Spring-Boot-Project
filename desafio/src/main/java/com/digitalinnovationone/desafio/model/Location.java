package com.digitalinnovationone.desafio.model;

import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Location {
    private long id;
    private String descricao;
    @OneToMany
    private AccessLevel accessLevel;
    
}
