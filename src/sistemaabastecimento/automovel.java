/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaabastecimento;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author coldf
 */
public class automovel implements Serializable{

    String placa;
    String modelo;
    int ano;
    String fabricante;
    double cap_tanque;
    double atual_tanque;
    int odometro;

    public automovel(String placa, String modelo, int ano, String fabricante, double cap_tanque, double atual_tanque, int odometro) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cap_tanque = cap_tanque;
        this.atual_tanque = atual_tanque;
        this.odometro = odometro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCap_tanque() {
        return cap_tanque;
    }

    public void setCap_tanque(double cap_tanque) {
        this.cap_tanque = cap_tanque;
    }

    public double getAtual_tanque() {
        return atual_tanque;
    }

    public void setAtual_tanque(double atual_tanque) {
        this.atual_tanque = atual_tanque;
    }

    public int getOdometro() {
        return odometro;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro;
    }

    @Override
   public boolean equals(Object obj) {
       automovel outro = (automovel)obj;
       
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if (this.placa == outro.getPlaca()&&this.modelo == outro.getModelo()){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    
    
    @Override
    public String toString() {

        return getModelo() + ", " + getAno() + ", " + getFabricante() + ", " + getPlaca() + " => Comb. Atual: " + getAtual_tanque()+ "L";

    }

}
