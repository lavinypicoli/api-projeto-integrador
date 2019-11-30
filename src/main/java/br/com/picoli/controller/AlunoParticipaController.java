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
import java.util.Optional;

@RestController
@RequestMapping("/alunoparticipa")
public class AlunoParticipaController {
    @Autowired
    AtividadeRepository atividadeRepository;
    @Autowired
    AlunoRepository alunoRepository;

    @PostMapping("/salvaParticipa")
    public AlunoParticipaDTO salvaParticipa(@RequestBody AlunoParticipaDTO alunoParticipaDTO){
            Integer iduseraluno = alunoParticipaDTO.getIdaluno();
            Integer idatividade = alunoParticipaDTO.getIdatividade();


            Optional<Aluno> optionalAluno = alunoRepository.findById(iduseraluno);
            List<Atividade> atividades =  atividadeRepository.findAllByIdativ(idatividade);


             Aluno aluno = optionalAluno.get();
            aluno.setAtividades(atividades);

           alunoRepository.save(aluno);


           return null;

    }
}
