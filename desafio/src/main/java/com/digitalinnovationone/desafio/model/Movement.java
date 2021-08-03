package com.digitalinnovationone.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import javax.persistence.Entity;

import lombok.*;

@Data
@Builder
@Entity
public class Movement {
    
    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class MovementId implements Serializable {
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateEntry;
    private LocalDateTime dateDeparture;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;

}
