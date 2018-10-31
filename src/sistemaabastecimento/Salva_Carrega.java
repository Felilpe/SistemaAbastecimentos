/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaabastecimento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author felipe.tavares
 */
public class Salva_Carrega extends registro {

    public void escreveCSV(registro tabela) {

        Path caminho = Paths.get("TabelaAbastecimento.CSV");
        try (PrintWriter saida = new PrintWriter(Files.newBufferedWriter(caminho))) {
            saida.print("Placa");
            saida.print(";");
            saida.print("Modelo");
            saida.print(";");
            saida.print("Ano");
            saida.print(";");
            saida.print("Fabricante");
            saida.print(";");
            saida.print("Capacidade Tanque");
            saida.print(";");
            saida.print("Atual Tanque");
            saida.print(";");
            saida.print("Odometro");
            saida.print(";");
            saida.print("Combustivel");
            saida.print(";");
            saida.print("Data");
            saida.print(";");
            saida.print("Ultimo Odometro");
            saida.print(";");
            saida.print("Litros Abastecidos");
            saida.print(";");
            saida.print("Preco Litro");
            saida.print(";");
            saida.print("Total Pago");
            saida.print(";");
            saida.print("\n");

            for (automovel umAutomovel : tabela.AutomovelAbastecimentos.keySet()) {
                for (umAbastecimento novoAbatecimento : tabela.AutomovelAbastecimentos.get(umAutomovel)) {
                    saida.print(umAutomovel.getPlaca());
                    saida.print(";");
                    saida.print(umAutomovel.getModelo());
                    saida.print(";");
                    saida.print(umAutomovel.getAno());
                    saida.print(";");
                    saida.print(umAutomovel.getFabricante());
                    saida.print(";");
                    saida.print(umAutomovel.getCap_tanque());
                    saida.print(";");
                    saida.print(umAutomovel.getAtual_tanque());
                    saida.print(";");
                    saida.print(umAutomovel.getOdometro());
                    saida.print(";");
                    saida.print(novoAbatecimento.getCombustivel());
                    saida.print(";");
                    saida.print(novoAbatecimento.getData());
                    saida.print(";");
                    saida.print(novoAbatecimento.getUltimo_Odom());
                    saida.print(";");
                    saida.print(novoAbatecimento.getLitros_Abastecidos());
                    saida.print(";");
                    saida.print(novoAbatecimento.getPreco_litro());
                    saida.print(";");
                    saida.print(novoAbatecimento.getTotal_pago());
                    saida.print(";");

                    saida.print("\n");
                }
            }
            saida.print("\n");

        } catch (Exception e) {
            System.out.println("Não foi possivel realizar atualização");
            e.printStackTrace();

        }
    }

    public registro leCSV() {
        registro itensCarregar = new registro();

        Path caminho = Paths.get("TabelaAbastecimento.CSV");

        try (BufferedReader entrada = Files.newBufferedReader(caminho)) {
            String linha = entrada.readLine();
            //linha = entrada.readLine();
            while ((linha = entrada.readLine()) != null) {
                String item[] = linha.split(";");

                double litrAtual = Double.parseDouble(item[5]);//guarda abatecimento
                automovel novoAutomovel = new automovel(item[0], item[1], Integer.parseInt(item[2]), item[3], Double.parseDouble(item[4]), litrAtual, Integer.parseInt(item[6]));


                umAbastecimento novoAbastecimento = new umAbastecimento(item[7], item[8], Integer.parseInt(item[9]), Double.parseDouble(item[10]), Double.parseDouble(item[11]));

                itensCarregar.addAutomovel(novoAutomovel);
                itensCarregar.addAbastecimento(novoAutomovel, novoAbastecimento);
    
              
            }

            System.out.println("Arquivo lido com sucesso.");
            //System.out.println(itensCarregar.get(0));
        } catch (IOException e) {
            System.out.println("Falha na leitura do arquivo.");
            e.printStackTrace();
        }
        return itensCarregar;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
