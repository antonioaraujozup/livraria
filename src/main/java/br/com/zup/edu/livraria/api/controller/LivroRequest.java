package br.com.zup.edu.livraria.api.controller;

import br.com.zup.edu.livraria.api.model.Livro;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.ISBN;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class LivroRequest {

    @NotBlank
    @Size(max = 200)
    private String titulo;

    @NotBlank
    @Size(max = 4000)
    private String descricao;

    @NotNull
    @Past
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataPublicacao;

    @ISBN
    private String isbn;

    public Livro paraLivro() {
        return new Livro(titulo,descricao,dataPublicacao,isbn);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
