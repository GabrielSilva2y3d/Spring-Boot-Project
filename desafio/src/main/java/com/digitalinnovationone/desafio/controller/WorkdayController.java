package com.digitalinnovationone.desafio.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.digitalinnovationone.desafio.model.Workday;
import com.digitalinnovationone.desafio.service.WorkdayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 


@RestController
@RequestMapping("/workday")
public class WorkdayController {

    @Autowired
    WorkdayService workdayService;
    
    @PostMapping
    public Workday createWorkday(@RequestBody Workday workday){
        return workdayService.save(workday);
    }
    @GetMapping
    public List<Workday> getWorkdayList(){
        return workdayService.findAll();
    }

    @GetMapping("/{idWorkday}")
    public ResponseEntity<Workday> getWorkdayById(@PathVariable("idWorkday") Long idWorkday) throws Exception{
        return ResponseEntity.ok(workdayService.getById(idWorkday).orElseThrow(() -> new Exception("Workday not found")));
    }
}

