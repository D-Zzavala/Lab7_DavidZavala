package lab7_davidzavala;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable {

    private static final long SerialVersionUID = 666L;

    private int Carros;
    private File ClientFile;
    private ArrayList<Persona> AllClientes;

    public Cliente() {
    }

    public Cliente(File Clientfile) {
        this.ClientFile = Clientfile;
    }

    public Cliente(String path) {
        ClientFile = new File(path);
    }

    public Cliente(String Nombre, String Apellido, int Edad, int Carros) {
        super(Nombre, Apellido, Edad);
        this.Carros = Carros;
    }

    public ArrayList<Persona> getAllClient() {
        return AllClientes;
    }

    public void setAllcars(ArrayList<Persona> AllClientes) {
        this.AllClientes = AllClientes;
    }

    public int getCarros() {
        return Carros;
    }

    public void setCarros(int Carros) {
        this.Carros = Carros;
    }

    public void setClientes(Persona p) {
        this.AllClientes.add(p);
    }

    @Override
    public String toString() {
        return "Carros: " + Carros;
    }

    public void cargarArchivo() {
        try {
            AllClientes = new ArrayList();
            Persona temp;
            if (ClientFile.exists()) {
                FileInputStream entrada = new FileInputStream(ClientFile);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Persona) objeto.readObject()) != null) {
                        AllClientes.add(temp);
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
            fw = new FileOutputStream(ClientFile);
            bw = new ObjectOutputStream(fw);
            for (Persona t : AllClientes) {
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
