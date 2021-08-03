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
public class BankHours {

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class BankHoursId implements Serializable{
        private long bankHoursId;
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    private BankHoursId id;
    private LocalDateTime workedDate;
    private BigDecimal workedHours;
    private BigDecimal workedHoursBalance;
    
}
