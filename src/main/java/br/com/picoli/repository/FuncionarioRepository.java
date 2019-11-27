package br.com.picoli.repository;

import br.com.picoli.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
        public Optional<Funcionario> findFuncionarioByEmailfuncAndSenhafunc(String emailfunc, String senhafunc);
}
