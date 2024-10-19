package com.petshop.cachorro.produtos;

public class Brinquedo {
    
    private String nome;
    private double valor;

    // construtor
    public Brinquedo (String nome, double valor) {
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
