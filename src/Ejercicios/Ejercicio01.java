package Ejercicios;

import java.util.ArrayList;

/**
 * Crea un  ArrayList con los nombres de 6 compañeros de clase. A continuación 
 * muestra esos nombre por pantalla. utiliza para ello un bucle "fro" que recorra
 * todo el "ArrayList" sin usar ningún índice
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();

        alumnos.add("Asia");
        alumnos.add("Libio");
        alumnos.add("Raúl");
        alumnos.add("Daniel");
        alumnos.add("Javier");
        alumnos.add("Andrea");

        System.out.println("Contenido de la lista de alumnos: ");
        for(int i=0; i <alumnos.size();i++){
            System.out.println(alumnos.get(i));
        }
    }
}
