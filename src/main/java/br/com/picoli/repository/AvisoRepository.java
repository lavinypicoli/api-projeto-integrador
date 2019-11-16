package br.com.picoli.repository;

import br.com.picoli.model.Aviso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisoRepository extends JpaRepository<Aviso, Integer> {

}
