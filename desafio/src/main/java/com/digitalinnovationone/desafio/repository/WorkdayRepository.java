package com.digitalinnovationone.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalinnovationone.desafio.model.Workday;

@Repository
public interface WorkdayRepository extends JpaRepository<Workday, Long> {
    
}
