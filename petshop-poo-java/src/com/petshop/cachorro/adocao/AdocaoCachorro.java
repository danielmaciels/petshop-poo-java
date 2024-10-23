package com.petshop.cachorro.adocao;


public class AdocaoCachorro {

        public static void main(String[] args) {
            
            //adotar cachorros
            Adotar adotarPinscher = new Adotar("Pinscher", "6 meses");
            Adotar adotarSalsicha = new Adotar("Salsicha", "3 meses");

            //parceiros
            Parceiro doarPet = new Parceiro("Tem Pet para doar?", "11 2222-3333");

                //INTERFACE     
                
                //títulos
                System.out.println("ADOÇÃO DE CACHORROS");
                System.out.println("Disponíveis:");
                
                    //seleção de cachorros
                    System.out.println("Raça: " + adotarPinscher.getRaca() +" Idade: " + adotarPinscher.getIdade());
                    System.out.println("Raça: " + adotarSalsicha.getRaca() + " Idade: " + adotarSalsicha.getIdade());


                    //doePet
                    System.out.println(doarPet.getTemPet() + " Entre em contato conosco: " + doarPet.getContato());


            

        }


}
