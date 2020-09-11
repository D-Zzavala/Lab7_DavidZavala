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
public class Persona {
    
    private int Edad;
    private String Nombre, Apellido;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, int Edad) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Apellido: " + Apellido + ", Edad: " + Edad;
    }
    
}
