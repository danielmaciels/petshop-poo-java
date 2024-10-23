package com.petshop.peixe.adocao;

public class AdocaoPeixe {
    
    public static void main(String[] args) {
            
        //adotar cachorros
        Adotar adotarPeixePalhaço = new Adotar("Peixe Palhaço", "16 dias");
        Adotar adotarPeixeBetta = new Adotar("Peixe Betta", "29 dias");

        //parceiros
        Parceiro doarPet = new Parceiro("Tem Pet para doar?", "11 2222-3333");

            //INTERFACE     
            
            //títulos
            System.out.println("ADOÇÃO DE PEIXES");
            System.out.println("Disponíveis:");
            
                //seleção de cachorros
                System.out.println("Raça: " + adotarPeixePalhaço.getRaca() +" Idade: " + adotarPeixePalhaço.getIdade());
                System.out.println("Raça: " + adotarPeixeBetta.getRaca() + " Idade: " + adotarPeixeBetta.getIdade());


                //doePet
                System.out.println(doarPet.getTemPet() + " Entre em contato conosco: " + doarPet.getContato());


        

    }



}
