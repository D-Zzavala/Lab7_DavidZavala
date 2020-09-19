package lab7_davidzavala;

import javax.swing.JProgressBar;

public class Process extends Thread {

    private JProgressBar ProgressBar;
    private int Lim;
    private boolean Avanzar;
    private boolean Vive;

    public Process() {
    }

    public Process(JProgressBar ProgressBar) {
        this.ProgressBar = ProgressBar;
        Avanzar = true;
        Vive = true;
    }

    public Process(JProgressBar ProgressBar, int Lim) {
        this.ProgressBar = ProgressBar;
        this.Lim = Lim;
    }

    public JProgressBar getProgressBar() {
        return ProgressBar;
    }

    public void setProgressBar(JProgressBar ProgressBar) {
        this.ProgressBar = ProgressBar;
    }

    public int getLim() {
        return Lim;
    }

    public void setLim(int Lim) {
        this.Lim = Lim;
    }

    public boolean isAvanzar() {
        return Avanzar;
    }

    public void setAvanzar(boolean Avanzar) {
        this.Avanzar = Avanzar;
    }

    public boolean isVive() {
        return Vive;
    }

    public void setVive(boolean Vive) {
        this.Vive = Vive;
    }
    
    @Override
    public void run(){
        while(Vive){
            if(Avanzar){
                ProgressBar.setValue(ProgressBar.getValue()+1);
                if(ProgressBar.getValue()==Lim){
                    Vive=false;
                }                
            } 
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
