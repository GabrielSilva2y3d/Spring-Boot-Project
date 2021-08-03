package com.digitalinnovationone.desafio.model;



import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Location {
    private long id;
    private String descricao;
    @ManyToOne 
    private AccessLevel accessLevel;
    
}
