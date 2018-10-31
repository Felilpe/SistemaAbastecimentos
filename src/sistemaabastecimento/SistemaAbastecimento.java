/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaabastecimento;


/**
 *
 * @author coldf
 */
public class SistemaAbastecimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*automovel carro1 = new automovel("AGH-1233", "Astra", 1990, "Ford", 50.0, 25.0, 1000);
        automovel carro2 = new automovel("IHS-1241", "Ka", 1990, "Ford", 30.0, 15.0, 10070);
        automovel carro3 = new automovel("SGY-1254", "Fusca", 1970, "Volkswagen", 20.0, 10.0, 232111);
        automovel carro4 = new automovel("IOA-1285", "Golf",2018 , "Volkswagen", 30.0, 12.0, 31231);

        umAbastecimento nota1 = new umAbastecimento("Gasolina", "2014-05-01", 10, 13, 5.12);
        umAbastecimento nota2 = new umAbastecimento("GNV", "2014-05-02", 20, 5, 4.0);
        umAbastecimento nota3 = new umAbastecimento("Alcool", "2014-05-03", 30, 6, 3.89);
        umAbastecimento nota4 = new umAbastecimento("GNV", "2014-05-04", 40, 5, 5.05);
        umAbastecimento nota5 = new umAbastecimento("GNV", "2014-05-05", 50, 10, 4.57);
        umAbastecimento nota6 = new umAbastecimento("GNV", "2014-05-06", 60, 11, 5.12);

        registro teste1 = new registro();
        teste1.addAutomovel(carro1);
        teste1.addAutomovel(carro1);
        teste1.addAutomovel(carro2);
        teste1.addAutomovel(carro3);
        teste1.addAutomovel(carro4);

        teste1.addAbastecimento(carro1, nota1); //Astra
        teste1.addAbastecimento(carro1, nota2); //Astra
        teste1.addAbastecimento(carro1, nota3); //Astra
        teste1.addAbastecimento(carro2, nota4); //Ka
        teste1.addAbastecimento(carro2, nota5); //Ka
        teste1.addAbastecimento(carro3, nota6); //Fusca
       
        System.out.println(teste1.toString());

        System.out.println("Média Abastecida: "+teste1.mediaAbastecidaLitrosTotal()+ "L");
        System.out.println("Média Paga: R$"+teste1.mediaPagaAbastecidaTotal());
        System.out.println("Rendimento por Litro: "+teste1.rendimentoLitroPercorridoTotal()+ "Km/L");*/
        
         //Salva_Carrega teste = new Salva_Carrega();
         //System.out.println(teste.leCSV().toString());

        /*automovel carro1 = new automovel("teste-1233", "teste", 1990, "Ford", 50.0, 25.0, 1000);
        umAbastecimento nota1 = new umAbastecimento("GNV", "2014-05-01", 10, 17, 5.12);
        registro teste1 = new registro();
        teste1.addAutomovel(carro1);
        teste1.addAbastecimento(carro1, nota1);*/
        
        registro testeFinal = new registro();
        testeFinal.carregarRegistroCSV();
        System.out.println(testeFinal);
        
        System.out.println("Média Abastecida: "+testeFinal.mediaAbastecidaLitrosTotal()+ "L");
        System.out.println("Média Paga: R$"+testeFinal.mediaPagaAbastecidaTotal());
        
        //testeFinal.SalvarRegistroCSV(teste1);
        
        //teste.escreveCSV(teste1);
        //rendimentoLitro
    }

}
