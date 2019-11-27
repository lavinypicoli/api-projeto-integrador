package br.com.picoli.controller;


import br.com.picoli.model.Aluno;
import br.com.picoli.model.AlunoAutenticavel;
import br.com.picoli.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/save")
    public Aluno cadastraAluno(@RequestBody @Valid Aluno aluno){

        return alunoRepository.save(aluno);
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Aluno> listaAluno(){
        Iterable<Aluno> listaAluno = alunoRepository.findAll();
        return listaAluno;
    }

    @PostMapping("/autentica")
    public Aluno autentica(@RequestBody @Valid AlunoAutenticavel alunoAutenticavel){
        Optional<Aluno> optionalAluno = alunoRepository.findAlunoByEmailalunoAndSenhaaluno(alunoAutenticavel.getEmailaluno(),
                alunoAutenticavel.getSenhaaluno());
        if (optionalAluno.isPresent()){
             Aluno aluno = optionalAluno.get();
            System.out.println("encontrou o aluno");
            return aluno;
        }else {
            System.out.println("não encontrou aluno");
            return null;
        }
    }



}
