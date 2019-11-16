package br.com.picoli.repository;

import br.com.picoli.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
        public Optional<Aluno> findAlunoByEmailAndSenha(String emailaluno, String senhaaluno);
}
