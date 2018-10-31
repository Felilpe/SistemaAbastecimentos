/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaabastecimento;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author coldf
 */
public class umAbastecimento {

    String combustivel;
    String data;
    int ultimo_Odom;
    double litros_Abastecidos;
    double preco_litro;
    double total_pago;

    public umAbastecimento(String combustivel, String data, int ultimo_Odom, double litros_Abastecidos, double preco_litro) {
        this.combustivel = combustivel;
        this.data = data;
        this.ultimo_Odom = ultimo_Odom;
        this.litros_Abastecidos = litros_Abastecidos;
        this.preco_litro = preco_litro;
        this.total_pago = litros_Abastecidos*preco_litro; //no construtor já se calcula o total 
    }

     public umAbastecimento(){};
    
    public String getData() {
        return data;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getUltimo_Odom() {
        return ultimo_Odom;
    }

    public void setUltimo_Odom(int ultimo_Odom) {
        this.ultimo_Odom = ultimo_Odom;
    }

    public double getLitros_Abastecidos() {
        return litros_Abastecidos;
    }

    public void setLitros_Abastecidos(double litros_Abastecidos) {
        this.litros_Abastecidos = litros_Abastecidos;
    }

    public double getPreco_litro() {
        return preco_litro;
    }

    public void setPreco_litro(double preco_litro) {
        this.preco_litro = preco_litro;
    }

    public double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(double total_pago) {
        this.total_pago = total_pago;
    }
    
    public String toString(){
    
        return "data: " + getData() +" | Abastecido:" +getLitros_Abastecidos() +"L"+  " | Valor Pago: R$"+  getTotal_pago() +" | Preço/Litro: R$" + getPreco_litro() +" | Odometro: " + getUltimo_Odom() + "km" ;
    
    }

}
