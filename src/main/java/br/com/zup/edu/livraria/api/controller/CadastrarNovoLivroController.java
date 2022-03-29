package br.com.zup.edu.livraria.api.controller;

import br.com.zup.edu.livraria.api.repository.model.Livro;
import br.com.zup.edu.livraria.api.repository.LivroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/livros")
public class CadastrarNovoLivroController {

    private final LivroRepository repository;

    public CadastrarNovoLivroController(LivroRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid LivroRequest request, UriComponentsBuilder uriComponentsBuilder) {

        Livro livro = request.paraLivro();

        repository.save(livro);

        URI location = uriComponentsBuilder.path("/livros/{id}").buildAndExpand(livro.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
