package ArraysList;

import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList
 */
public class EjemploArrayList04 {
    public static void main(String[] args) {
            ArrayList<String> a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");

        System.out.println("\nContenido de la lista: \n");
        
        for(String color: a){
            System.out.println(color);
        }

        //BLANCO
        if(a.contains("blanco")){
            System.out.println("El blanco está en la lista de colores");
        }
        a.remove("blanco");

        System.out.println("\nContenido de la lista después de quitar la "+ "primera ocurrencia del color blanco");
        

        //POSICIÓN
        for(String color: a){
            System.out.println(color);
        }

        a.remove(2);
        System.out.println("\nContenido de la lista después de quitar el "+" elemento de la posición 2: ");


        for(String color: a){
            System.out.println(color);
        }
    }
}
