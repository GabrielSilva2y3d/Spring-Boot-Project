package com.digitalinnovationone.desafio.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class User {
    @Id
    private long id;
    private String name;

    @ManyToOne
    private UserCategory userCategory;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private Workday workday;
    
    private BigDecimal tolerance;
    private LocalDateTime startWorkday;
    private LocalDateTime endWorkday;
}
