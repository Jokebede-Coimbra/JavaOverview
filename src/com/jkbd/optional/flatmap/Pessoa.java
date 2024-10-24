package com.jkbd.optional.flatmap;

import java.util.Optional;

public class Pessoa {
    private String nome;
    private Optional<Endereco> endereco;

    public Pessoa(String nome, Optional<Endereco> endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(Optional<Endereco> endereco) {
        this.endereco = endereco;
    }
}