package com.petshop.cachorro.produtos;

public class Alimentacao {
    
    private String nome;
    private double valor;

    // construtor
    public Alimentacao (String nome, double valor) {
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
