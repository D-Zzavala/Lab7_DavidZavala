package lab7_davidzavala;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable {

    private static final long SerialVersionUID = 666L;

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
