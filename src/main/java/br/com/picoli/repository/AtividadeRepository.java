package br.com.picoli.repository;

import br.com.picoli.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
        List<Atividade> findAllByIdativ (Integer id);
}
