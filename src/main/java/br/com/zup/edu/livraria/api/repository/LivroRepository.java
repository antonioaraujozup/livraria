package br.com.zup.edu.livraria.api.repository;

import br.com.zup.edu.livraria.api.repository.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
