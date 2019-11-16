package br.com.picoli.controller;


import br.com.picoli.model.Aviso;
import br.com.picoli.repository.AvisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/aviso")
public class AvisoController {
     @Autowired
    private AvisoRepository avisoRepository;

     @PostMapping("/save")
     public Aviso cadastraAviso(@RequestBody @Valid Aviso aviso){
         return avisoRepository.save(aviso);
     }

     @GetMapping(produces = "application/json")
     public @ResponseBody Iterable<Aviso> listaAviso(){
         Iterable<Aviso> listaAviso = avisoRepository.findAll();
         return listaAviso;
     }

}