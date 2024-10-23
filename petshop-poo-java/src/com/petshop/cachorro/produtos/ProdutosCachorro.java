package com.petshop.cachorro.produtos;

public class ProdutosCachorro {

    public static void main(String[] args) {
    

    //títulos
    System.out.println("PRODUTOS PARA CACHORRO");

        //produtos
        Racao pedigree = new Racao("Ração Pedigree", 17.99);
        Petisco biscrok = new Petisco("Petisco Biscrok", 12.99);
        Brinquedo mordedor = new Brinquedo("Mordedor Galinha", 9.99);
        Coleira coleiraPeitoral = new Coleira("Coleira Peitoral", 18.99);
        Alimentacao salameDudog = new Alimentacao("Salame Dudog", 34.99);
        Roupa coleteCroche = new Roupa("Colete Crochê", 38.99);



            //interface
            System.out.println(pedigree.getNome() + ": R$ " + pedigree.getValor());
            System.out.println(biscrok.getNome()+ ": R$ " + biscrok.getValor());
            System.out.println(mordedor.getNome() + ": R$ " + mordedor.getValor());
            System.out.println(coleiraPeitoral.getNome() + ": R$ " + coleiraPeitoral.getValor());
            System.out.println(salameDudog.getNome() + ": R$ " + salameDudog.getValor());
            System.out.println(coleteCroche.getNome() + ": R$ " + coleteCroche.getValor());


    }
    
}

