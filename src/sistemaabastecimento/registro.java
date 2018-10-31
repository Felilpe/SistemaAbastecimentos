/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaabastecimento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class registro {

    Map<automovel, ArrayList<umAbastecimento>> AutomovelAbastecimentos = new HashMap<>();

    // Instancia Vazio
    public registro() {
    }

    //Método para adicionar um carro novo, ao mesmo tempo cria um ArrayList de Abastecimentos (começa vazio)
    public boolean addAutomovel(automovel umAutomovel) {

        if (!this.AutomovelAbastecimentos.containsKey(umAutomovel)) {
            ArrayList<umAbastecimento> abastecimentos = new ArrayList<>();
            AutomovelAbastecimentos.put(umAutomovel, abastecimentos);
            return true;
        }
        return false;
    }

    //Método que adiciona um abastecimento no ArrayList, caso o carro exista
    public boolean addAbastecimento(automovel umAutomovel, umAbastecimento novoAbastecimento) {

        if (this.AutomovelAbastecimentos.containsKey(umAutomovel)) {
            AutomovelAbastecimentos.get(umAutomovel).add(novoAbastecimento);
            return true;
        }
        return false;
    }

    //carrega os registros do banco
    public void carregarRegistroCSV() {
        Salva_Carrega banco = new Salva_Carrega();
        AutomovelAbastecimentos.putAll(banco.leCSV().AutomovelAbastecimentos);
    }

    //salva os registros do banco
    public void SalvarRegistroCSV(registro umRegistro) {
        Salva_Carrega banco = new Salva_Carrega();
        banco.escreveCSV(umRegistro);
    }
//metodo para arredondamento de double em duas casas

    public static double Arredondar(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    //Método que calcula a media de abastecimentos, primeiro percorre em cada carro seus abastecimentos, depois soma e divide pelo numero de Abastecimentos
    public double mediaAbastecidaLitrosTotal() {

        double litrosAbast = 0;
        int cont = 0;

        for (automovel umAutomovel : AutomovelAbastecimentos.keySet()) {
            for (umAbastecimento valor : AutomovelAbastecimentos.get(umAutomovel)) {
                ++cont;
                litrosAbast = litrosAbast + valor.getLitros_Abastecidos();
            }
        }
        return Arredondar((litrosAbast / cont), 2);
    }

//Método que calcula media de valor pago em todos automoveis, primeiro percorre em cada carro seus valores pagos depois soma e divide pelo numero de abastecimentos  pagos
    public double mediaPagaAbastecidaTotal() {

        double pagos = 0;
        int cont = 0;

        for (automovel umAutomovel : AutomovelAbastecimentos.keySet()) {
            for (umAbastecimento valor : AutomovelAbastecimentos.get(umAutomovel)) {
                ++cont;
                pagos = pagos + valor.getTotal_pago();
            }
        }
        return Arredondar((pagos / cont), 2);
    }

    //Calcula a distancia pelo valor pago de gasolina
    public double CustoPercorridoPagoTotal() {
        return 0.0;
    }

    //Calcula o rendimento, percurso por litro consumido
    public double rendimentoLitroPercorridoTotal() {
        return 0;
    }

    //conta Abasecimentos
    public int numeroAbastecimentos() {
        int cont = 0;
        for (automovel umAutomovel : AutomovelAbastecimentos.keySet()) {
            for (umAbastecimento valor : AutomovelAbastecimentos.get(umAutomovel)) {
                ++cont;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        
        String texto = "";
        
        for (automovel umAutomovel : AutomovelAbastecimentos.keySet()) {
            texto = texto + "------" + "\n";
            texto = texto + umAutomovel.toString() + "\n";

            for (umAbastecimento QtdAbst : AutomovelAbastecimentos.get(umAutomovel)) {
                texto = texto + QtdAbst.toString() + "\n";
            }
        }
        return texto + "------" + "\n";
    }
}
