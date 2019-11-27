package br.com.picoli.controller;

import br.com.picoli.model.Funcionario;
import br.com.picoli.model.FuncionarioAutenticavel;
import br.com.picoli.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

   @PostMapping("/save")
    public Funcionario cadastraFuncionario(@RequestBody @Valid Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Funcionario> listaFuncionario(){
       Iterable<Funcionario> listaFuncionario = funcionarioRepository.findAll();
       return listaFuncionario;
    }

    @PostMapping("autentica")
    public Funcionario autentica(@RequestBody @Valid FuncionarioAutenticavel funcAutenticavel){
        Optional<Funcionario> optionalFuncionario =
                funcionarioRepository.findFuncionarioByEmailfuncAndSenhafunc(funcAutenticavel.getEmailfunc(), funcAutenticavel.getSenhafunc());
        if (optionalFuncionario.isPresent()){
            Funcionario funcionario = optionalFuncionario.get();
            System.out.println("encontrou funcionario");
            return funcionario;
        }else{
            System.out.println("não encontrou funcionario");
            return null;
        }
    }
}
