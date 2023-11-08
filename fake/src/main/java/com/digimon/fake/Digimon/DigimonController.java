package com.digimon.fake.Digimon;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DigimonController {

    @Autowired
    DigimonRepository digimonRepository;

    @GetMapping("/digimon")
    public List<Digimon> getDigimon(){
        return (List<Digimon>) (digimonRepository.findAll());
    }

    /*@GetMapping("/digimon/{id}")
    public Optional<Digimon> getDigimonById(@PathVariable("id") int number){
        Optional<Digimon> digimon = digimonRepository.findById(number);
        return digimon;
    }*/

    @PostMapping("/digimon")
    void addDigimon(@RequestBody Digimon digimon){
        digimonRepository.save(digimon);
    }

}
