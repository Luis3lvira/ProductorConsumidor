
package ProdConsumidor;


public class Container {
    private int dato;
    private boolean hayDato = false;
    public synchronized int get(){
        while(hayDato == false){
            try{
                // EN ESTE PASO EL CONTENEDOR VA A ESPERAR A QUE EL PRODUCTOR COLOQUE EL PRODUCTO
                wait();
            } catch(InterruptedException e){ }
        }

        hayDato = false;
        // AVISAMOS QUE YA SE CONSUMIÓ EL VALOR
        notifyAll();
        return dato;
    }
    public synchronized void put(int valor){
        while(hayDato == true){
            try{
                // ESPERAMOS A QUE SE CONSUMA EL DATO 
                wait();
            }catch(InterruptedException e){ }
        }
        dato = valor;
        hayDato = true;
        // NOTIFICAMOS QUE YA NO HAY DATO
        notifyAll();
    }
}