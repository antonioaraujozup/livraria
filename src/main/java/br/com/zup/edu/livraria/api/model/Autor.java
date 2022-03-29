package br.com.zup.edu.livraria.api.model;

import javax.persistence.*;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 120)
    private String email;

    @Lob
    @Column(nullable = false, length = 2500)
    private String descricao;

    @Column(nullable = false, unique = true)
    private String cpf;

    public Autor(String nome, String email, String descricao, String cpf) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.cpf = cpf;
    }

    @Deprecated
    /**
     * @deprecated Construtor exclusivo para uso do Hibernate.
     */
    public Autor() {
    }

    public Long getId() {
        return id;
    }

}
