package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Estado;

public class EstadoDTO {

    private Integer id;
    private String nome;

    public EstadoDTO(Estado obj) {
    }

    public EstadoDTO(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
