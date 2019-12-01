package br.com.picoli.controller;

import br.com.picoli.model.Aluno;
import br.com.picoli.model.AlunoParticipaDTO;
import br.com.picoli.model.Atividade;
import br.com.picoli.repository.AlunoRepository;
import br.com.picoli.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/alunoparticipa")
public class AlunoParticipaController {
    @Autowired
    AtividadeRepository atividadeRepository;
    @Autowired
    AlunoRepository alunoRepository;

    @PostMapping("/salvaParticipa")
    public boolean salvaParticipa(@RequestBody Map<String, Object> json){

        String idalunop = (String) json.get("idalunop");
        String idatividadep = (String) json.get("idatividadep");
        Integer idaluno = Integer.parseInt(idalunop);
        Integer idatividade = Integer.parseInt(idatividadep);

        System.out.println(idaluno);
        System.out.println(idatividade);




            Optional<Aluno> optionalAluno = alunoRepository.findById(idaluno);
            List<Atividade> atividades =  atividadeRepository.findAllByIdativ(idatividade);


            Aluno aluno = optionalAluno.get();
            aluno.setAtividades(atividades);

           alunoRepository.save(aluno);


           return true;

    }
}
