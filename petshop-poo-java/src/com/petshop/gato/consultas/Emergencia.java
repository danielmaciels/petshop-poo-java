package com.petshop.gato.consultas;

public class Emergencia {
    
    private String ligue;
    private String numero;

    // construtor
    public Emergencia (String ligue, String numero) {
        this.ligue = ligue;
        this.numero = numero;
    }
    public String getContato() {
        return ligue;
    }
    public String getNumero() {
        return numero;
    }


}
