package com.example.tiagolimadev.solidarizeapp.model;

import java.util.Date;

/**
 * Created by tiagolimadev on 10/25/17.
 */

public class Evento {

    private String nome;
    private String descricao;
    private Date data;
    private String horario;

    public Evento() {
    }

    public Evento(String nome, String descricao, Date data, String horario) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
