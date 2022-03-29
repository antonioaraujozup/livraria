package br.com.zup.edu.livraria.api.controller;

import br.com.zup.edu.livraria.api.model.Autor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AutorRequest {

    @NotBlank
    @Size(max = 120)
    private String nome;

    @NotBlank
    @Size(max = 120)
    @Email
    private String email;

    @NotBlank
    @Size(max = 2500)
    private String descricao;

    @NotBlank
    @CPF
    private String cpf;

    public Autor paraAutor() {
        return new Autor(nome,email,descricao,cpf);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
