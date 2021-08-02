package com.digitalinnovationone.desafio.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private long id;
    private UserCategory userCategory;
    private String name;
    private Company company;
    private AccessLevel accessLevel;
    private Workday workday;
    private BigDecimal tolerance;
    private LocalDateTime startWorkday;
    private LocalDateTime endWorkday;
}
