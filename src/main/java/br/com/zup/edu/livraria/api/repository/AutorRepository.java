package br.com.zup.edu.livraria.api.repository;

import br.com.zup.edu.livraria.api.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}

