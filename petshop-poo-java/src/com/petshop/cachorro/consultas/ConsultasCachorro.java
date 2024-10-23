package com.petshop.cachorro.consultas;


public class ConsultasCachorro {

        public static void main(String[] args) {
           
        //títulos
        System.out.println("CONSULTAS PARA CACHORRO");

            //consultas
            Emergencia ligueEmergencia = new Emergencia("EMERGÊNCIA | Ligue agora", "12 3456-7890");
            Agendar agendarConsulta = new Agendar("Agende uma consulta", "09 8765-4321");

                //interface
                System.out.println(ligueEmergencia.getContato() + ": " + ligueEmergencia.getNumero());
                System.out.println(agendarConsulta.getConsulta() + ": " + agendarConsulta.getNumero());


        }

}
