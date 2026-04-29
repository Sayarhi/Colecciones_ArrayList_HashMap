package ArraysList;

import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList
 */
public class EjemploArrayList011 {
    public static void main(String[] args) {
        
        ArrayList <Integer> a = new ArrayList<Integer>();

        a.add(19); //posición: 0
        a.add(-40); //posición: 1
        a.add(5); //posición: 2

        System.out.println("Nº de elementos: "+ a.size()); //muestras los 3 a.add

        System.out.println("El elemento que hay en la posiciçon 1 es "+a.get(1));
    }
}
