package com.wttn.demo.apis;

import com.wttn.demo.entities.Lead;
import com.wttn.demo.repositories.LeadRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/lead")
@RestController
public class LeadController {

    private LeadRepository leadRepository;

    public LeadController(LeadRepository leadRepository){
        this.leadRepository = leadRepository;
    }

    @GetMapping("/")
    public List<Lead> findAll(){
        return leadRepository.findAll();
    }

    @PutMapping("/insert")
    public boolean insertLead(Lead lead){
        leadRepository.save(lead);
        return true;
    }
}
