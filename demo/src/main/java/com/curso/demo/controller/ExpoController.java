package com.curso.demo.controller;

import com.curso.demo.model.clases.CocheWeb;
import com.curso.demo.model.clases.ExpoWeb;
import com.curso.demo.repositories.ExpoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ExpoController {
    @Autowired
    private ExpoRepository expoRepository;
    @RequestMapping("/addExpo")
    public String addExpo (@RequestBody ExpoWeb input){
        expoRepository.save(input);
        return "Enhorabuena, el coche ha sido incluido con exito";
    }
    @GetMapping("/expo/{id}")
    public ExpoWeb expoWeb (@PathVariable Integer id) throws Exception {
        Optional<ExpoWeb> expoWeb = expoRepository.findById(id);
        if(expoWeb.isPresent()) return expoWeb.get();
        throw new Exception("La expo con " + id + " no existe");
    }
    @GetMapping("/exposiciones")
    public List<ExpoWeb> expoWebs(){ return expoRepository.findAll();
    }

    @DeleteMapping("/coche/{id}")
    public String deleteExpo(@PathVariable Integer id){
        expoRepository.deleteById(id);
        return "Expo borrada";
    }
}
