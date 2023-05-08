
package ProdConsumidor;

public class Consumer extends Thread{
    private Container contenedor;
    private MainProd control;
    private int nombre;
    private boolean iniciar = true;
    public Consumer(Container c, MainProd control, int nombre){
        contenedor= c;
        this.control = control;
        this.nombre = nombre;
        control.registrar("Agregaste un consumidor "+nombre);
    }
    public void run(){
        int value = 0;
        while(iniciar){
            value = contenedor.get();
            control.registrar("El consumidor "+nombre+" esta consumiendo un: " + value);
        }
        control.registrar("El consumidor "+nombre+" Finalizo.");
    }
    
    public void detener(){
        this.iniciar = false;
    }
}