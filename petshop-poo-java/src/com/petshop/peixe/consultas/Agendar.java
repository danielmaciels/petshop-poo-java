package com.petshop.peixe.consultas;

public class Agendar {
    
 
    private String consulta;
    private String numero;

        // construtor
        public Agendar (String consulta, String numero) {
            this.consulta = consulta;
            this.numero = numero;
        }
        public String getConsulta() {
            return consulta;
        }
        public String getNumero() {
            return numero;
        }


}
