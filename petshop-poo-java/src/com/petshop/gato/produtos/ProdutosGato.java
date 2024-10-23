package com.petshop.gato.produtos;

public class ProdutosGato {
    
    public static void main(String[] args) {
    
    //títulos
    System.out.println("PRODUTOS PARA GATO");

        //produtos
        Racao wiskas = new Racao("Ração Wiskas", 15.99);
        Petisco sardinha = new Petisco("Petisco Sardinha", 13.99);
        Brinquedo arranhador = new Brinquedo("Arranhador", 18.99);
        Coleira coleiraPescoco = new Coleira("Coleira de Pescoço", 11.99);
        Alimentacao batataDoce = new Alimentacao("Batata-doce", 19.99);
        Roupa blusaLinho = new Roupa("Blusa de Linho", 32.99);



            //interface
            System.out.println(wiskas.getNome() + ": R$ " + wiskas.getValor());
            System.out.println(sardinha.getNome()+ ": R$ " + sardinha.getValor());
            System.out.println(arranhador.getNome() + ": R$ " + arranhador.getValor());
            System.out.println(coleiraPescoco.getNome() + ": R$ " + coleiraPescoco.getValor());
            System.out.println(batataDoce.getNome() + ": R$ " + batataDoce.getValor());
            System.out.println(blusaLinho.getNome() + ": R$ " + blusaLinho.getValor());


    }
    



}
