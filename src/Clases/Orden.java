
package Clases;


public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static int maxComputadoras = 10;
    
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }
    
    public void agregarComputadora( Computadora computadora ){
        
        if ( contadorComputadoras < Orden.maxComputadoras ) {
             computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("La orden esta llena");
        }
    }
    
    public void monstrarOrden(){
        System.out.println("Orden: ");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println( this.computadoras[i] );
        }
    }
    
}
