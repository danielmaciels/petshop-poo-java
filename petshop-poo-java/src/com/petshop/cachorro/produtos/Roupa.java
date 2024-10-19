package com.petshop.cachorro.produtos;

public class Roupa {
    
    private String nome;
    private double valor;

    // construtor
    public Roupa (String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

}
