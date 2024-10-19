package com.petshop.cachorro.produtos;

public class Coleira {
   
    private String nome;
    private double valor;

    // construtor
    public Coleira (String nome, double valor) {
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
