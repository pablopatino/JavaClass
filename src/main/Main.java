
package main;

import Clases.Computadora;
import Clases.Monitor;
import Clases.Orden;
import Clases.Raton;
import Clases.Teclado;


public class Main {

   
    public static void main(String[] args) {
        
        Orden orden = new Orden();
        
        Teclado teclado = new Teclado("Entrada","marca");
        Teclado teclado2 = new Teclado("Entrada","marca");
        Raton raton = new Raton("EntradaR","marcaR");
        Monitor monitor = new Monitor("MarcaM",10);
        
        Computadora computadora = new Computadora("HP",monitor,teclado,raton);
        
        orden.agregarComputadora(computadora);
        
        Computadora computadora2 = new Computadora("HP",monitor,teclado2,raton);
        orden.agregarComputadora(computadora2);
        
        orden.monstrarOrden();
   
    }
    
}
