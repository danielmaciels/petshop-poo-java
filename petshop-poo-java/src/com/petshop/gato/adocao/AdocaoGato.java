package com.petshop.gato.adocao;

public class AdocaoGato {
 
    public static void main(String[] args) {
            
        //adotar cachorros
        Adotar adotarGatoAmarelo = new Adotar("Amarelo", "2 meses");
        Adotar adotarGatoPreto = new Adotar("Preto", "3 semanas");

        //parceiros
        Parceiro doarPet = new Parceiro("Tem Pet para doar?", "11 2222-3333");

            //INTERFACE     
            
            //títulos
            System.out.println("ADOÇÃO DE GATOS");
            System.out.println("Disponíveis:");
            
                //seleção de cachorros
                System.out.println("Raça: " + adotarGatoAmarelo.getRaca() +" Idade: " + adotarGatoAmarelo.getIdade());
                System.out.println("Raça: " + adotarGatoPreto.getRaca() + " Idade: " + adotarGatoPreto.getIdade());


                //doePet
                System.out.println(doarPet.getTemPet() + " Entre em contato conosco: " + doarPet.getContato());


        

    }






}
