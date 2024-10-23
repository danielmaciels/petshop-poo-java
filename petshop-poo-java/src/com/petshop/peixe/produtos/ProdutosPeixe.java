package com.petshop.peixe.produtos;

public class ProdutosPeixe {
    
    public static void main(String[] args) {
    

    //títulos
    System.out.println("PRODUTOS PARA PEIXE");


        //produtos
        Racao racaoAcquapex = new Racao("Ração Acquapex", 16.99);
        Petisco petiscoAcquapex = new Petisco("Petisco Acquapex", 11.99);
        Brinquedo tunelAbizoo = new Brinquedo("Túnel Abizoo", 32.99);
        Alimentacao alface = new Alimentacao("Alface", 6.99);




            //interface
            System.out.println(racaoAcquapex.getNome() + ": R$ " + racaoAcquapex.getValor());
            System.out.println(petiscoAcquapex.getNome()+ ": R$ " + petiscoAcquapex.getValor());
            System.out.println(tunelAbizoo.getNome() + ": R$ " + tunelAbizoo.getValor());
            System.out.println(alface.getNome() + ": R$ " + alface.getValor());
           


    }
    


}
