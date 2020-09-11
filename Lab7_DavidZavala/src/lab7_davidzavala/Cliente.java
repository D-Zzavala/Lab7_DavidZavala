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
public class Cliente extends Persona {
    
    private int Carros;
    
    public Cliente() {
    }
        
    public Cliente(String Nombre, String Apellido, int Edad, int Carros) {
        super(Nombre, Apellido, Edad);
        this.Carros=Carros;
    }

    public int getCarros() {
        return Carros;
    }

    public void setCarros(int Carros) {
        this.Carros = Carros;
    }
    
    @Override
    public String toString() {
        return "Carros: " + Carros;
    }
    
}
