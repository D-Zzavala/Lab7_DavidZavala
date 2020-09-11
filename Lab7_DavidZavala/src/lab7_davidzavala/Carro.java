/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_davidzavala;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 50431
 */
public class Carro implements Serializable {

    private static final long SerialVersionUID = 666L;

    private ArrayList<Carro> Allcars = new ArrayList();
    private File CarFile;
    private int Puertas, Sucio;
    private String Placa, Tamano;

    public Carro() {
    }

    public Carro(int Puertas, int Sucio, String Placa, String Tamano) {
        this.Puertas = Puertas;
        this.Sucio = Sucio;
        this.Placa = Placa;
        this.Tamano = Tamano;
    }

    public Carro(File CarFile) {
        this.CarFile = CarFile;
        }   

    public Carro(String path) {
        CarFile = new File(path);
    }

    public ArrayList<Carro> getAllcars() {
        return Allcars;
    }

    public void setAllcars(ArrayList<Carro> Allcars) {
        this.Allcars = Allcars;
    }

    public File getCarFile() {
        return CarFile;
    }

    public void setCarFile(File CarFile) {
        this.CarFile = CarFile;
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

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String Tamano) {
        this.Tamano = Tamano;
    }
    
    public void setCArro(Carro car) {
        this.Allcars.add(car);
    }

    @Override
    public String toString() {
        return Placa + ", Puertas: " + Puertas + ", Sucio: " + Sucio + ", Tamaño: " + Tamano;
    }
    public String toString2() {
        return "Carro{" + "Allcars=" + Allcars + ", CarFile=" + CarFile + ", Puertas=" + Puertas + ", Sucio=" + Sucio + ", Placa=" + Placa + ", Tamano=" + Tamano + '}';
    }
    
    
    
        public void cargarArchivo() {
        try {
            Allcars = new ArrayList();
            Carro temp;
            if (CarFile.exists()) {
                FileInputStream entrada
                        = new FileInputStream(CarFile);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carro) objeto.readObject()) != null) {
                        Allcars.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(CarFile);
            bw = new ObjectOutputStream(fw);
            for (Carro t : Allcars) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
