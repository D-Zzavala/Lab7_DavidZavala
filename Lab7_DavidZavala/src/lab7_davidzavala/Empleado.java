package lab7_davidzavala;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Empleado extends Persona implements Serializable {

    private static final long SerialVersionUID = 666L;

    private ArrayList<Empleado> AllEmpleados;
    private File EmployFile;
    private int Carros;
    private ArrayList<Carro> ArrCarros;

    public Empleado() {
    }
    
    public Empleado(File EmploFile) {
        this.EmployFile = EmploFile;
    }
    
    public Empleado(String path) {
        EmployFile = new File(path);
    }

    public Empleado(String Nombre, String Apellido, int Edad, ArrayList<Carro> ArrCarros) {
        super(Nombre, Apellido, Edad);
        this.ArrCarros = ArrCarros;
    }
    
     public ArrayList<Empleado> getAllEmpleados() {
        return AllEmpleados;
    }
     public ArrayList<Carro> getCarros() {
        return ArrCarros;
    }

    public void setCarros(ArrayList<Carro> allCarros) {
        this.ArrCarros = allCarros;
    }
    public void setAllEmpleados(ArrayList<Empleado> allEmpleados) {
        this.AllEmpleados = allEmpleados;
    }

    public void setEmpleados(Empleado p) {
        this.AllEmpleados.add(p);
    }
    
    public void cargarArchivo() {
        try {
            AllEmpleados = new ArrayList();
            Empleado temp;
            if (EmployFile.exists()) {
                FileInputStream entrada = new FileInputStream(EmployFile);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleado) objeto.readObject()) != null) {
                        AllEmpleados.add(temp);
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
            fw = new FileOutputStream(EmployFile);
            bw = new ObjectOutputStream(fw);
            for (Persona t : AllEmpleados) {
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
