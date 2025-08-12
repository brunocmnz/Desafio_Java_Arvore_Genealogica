package com.CE_TP;

public class Pessoa {
    private int id;
    private String nome;
    private String nomePai;

    public Pessoa(String nome, String nomePai) {
        this.nome = nome;
        this.nomePai = nomePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
