package com.petshop.peixe.produtos;

public class Petisco {
    
    private String nome;
    private double valor;

    // construtor
    public Petisco (String nome, double valor) {
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
