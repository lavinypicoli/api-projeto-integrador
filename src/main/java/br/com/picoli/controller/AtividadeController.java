package br.com.picoli.controller;

import br.com.picoli.model.Atividade;
import br.com.picoli.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @PostMapping("/save")
    public Atividade cadastraAtividade(@RequestBody @Valid Atividade atividade){
        return atividadeRepository.save(atividade);
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Atividade> listaAtividade(){
        Iterable<Atividade> listaAtividade = atividadeRepository.findAll();
        return listaAtividade;
    }

    @DeleteMapping("/delete")
    public void deletaAtividade(@RequestBody @Valid Atividade atividade){
        atividadeRepository.delete(atividade);
    }

    @PutMapping("/edit")
    public Atividade atualizaAtividade(@RequestBody @Valid Atividade atividade){
        return atividadeRepository.save(atividade);
    }



}
