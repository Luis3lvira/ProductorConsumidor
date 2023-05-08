
package ProdConsumidor;


import static java.lang.Thread.sleep;

public class Pruduct extends Thread{
    private Container contenedor;
    private MainProd control;
    private int nombre;
    private boolean iniciar = true;
    public Pruduct(Container c, MainProd ccp, int nombre){
        contenedor = c;
        this.control = ccp;
        this.nombre = nombre;
        ccp.registrar("Agregaste Productor: "+nombre);
    }
    public void run(){
        int value = 1;
        while(iniciar){
            contenedor.put(value);
            control.registrar("productor "+nombre+" Acaba de Agregar: " + value);
            try{
                sleep(2000);
                value++;
            } catch(InterruptedException e) { }
        }
        control.registrar("productor "+nombre+" finalizo.");
    }
    
    public void detener(){
        this.iniciar = false;
    }
}