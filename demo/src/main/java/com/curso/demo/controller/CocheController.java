package com.curso.demo.controller;

import com.curso.demo.model.clases.ClienteWeb;
import com.curso.demo.model.clases.CocheWeb;
import com.curso.demo.repositories.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CocheController {
    @Autowired
    private CocheRepository cocheRepository;

    @RequestMapping("/addCoche")
    public String addCoche (@RequestBody CocheWeb input){
        cocheRepository.save(input);
        return "Enhorabuena, el coche ha sido incluido con exito";
    }
    @GetMapping("/coche/{id}")
    public CocheWeb cocheWeb (@PathVariable Integer id) throws Exception {
        Optional<CocheWeb> cocheWeb = cocheRepository.findById(id);
        if(cocheWeb.isPresent()) return cocheWeb.get();
        throw new Exception("El coche con " + id + " no existe");
    }
    @GetMapping("/coches")
    public List<CocheWeb> cocheWebs(){ return cocheRepository.findAll();
    }

    @DeleteMapping("/coche/{id}")
    public String delecteCohe(@PathVariable Integer id){
        cocheRepository.deleteById(id);
        return "Borrado";
    }

}
