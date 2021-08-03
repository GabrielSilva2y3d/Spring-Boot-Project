package com.digitalinnovationone.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.digitalinnovationone.desafio.model.Workday;
import com.digitalinnovationone.desafio.repository.WorkdayRepository;

@Service
public class WorkdayService {
    
    WorkdayRepository workdayRepository;

    @Autowired
    public WorkdayService(WorkdayRepository workdayRepository){
        this.workdayRepository = workdayRepository;
    }

    public Workday save(Workday workday){
        return workdayRepository.save(workday);
    }

    public List<Workday> findAll() {
        return workdayRepository.findAll();
    }

    public Optional<Workday> getById(Long idWorkday) {
        return workdayRepository.findById(idWorkday);
    }

    public Workday udate(Workday workday){
        return workdayRepository.save(workday);
    }

    public void delete(Long idWorkday) {
        workdayRepository.deleteById(idWorkday);
    }
}
