package com.petshop.cachorro.adocao;

public class Parceiro {
    
    private String temPet;
    private String contato;

        // construtor
        public Parceiro (String temPet, String contato) {
            this.temPet = temPet;
            this.contato = contato;
        }
        public String getTemPet() {
            return temPet;
        }
        public String getContato() {
            return contato;
        }


}
