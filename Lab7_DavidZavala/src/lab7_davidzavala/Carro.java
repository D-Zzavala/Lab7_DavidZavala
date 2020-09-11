/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_davidzavala;

/**
 *
 * @author 50431
 */
public class Carro {
    private int Placa,Puertas,Sucio;
    private String Tamano;

    public Carro() {
    }

    public Carro(int Placa, String Tamano, int Puertas, int Sucio) {
        this.Placa = Placa;
        this.Puertas = Puertas;
        this.Sucio = Sucio;
        this.Tamano = Tamano;
    }

    public int getPlaca() {
        return Placa;
    }

    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    public int getSucio() {
        return Sucio;
    }

    public void setSucio(int Sucio) {
        this.Sucio = Sucio;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String Tamano) {
        this.Tamano = Tamano;
    }

    @Override
    public String toString() {
        return "Placa:" + Placa + ", Puertas:" + Puertas + ", Sucio:" + Sucio + ", Tamano:" + Tamano;
    }
    
    
}
