package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa que introduzca valores aleatorios(entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma,la media,el máximo y el mínimo de esos número. El tamaño 
 * de la lista también será aleatorio y podrá asociar entre 10 y 20 elementos ambos inclusive 
 */
public class Ejercicio02 {
    public static void main(String[] args) {

        //Define de forma aleatoria  el tamaño de la lista
        int tamaño =(int)(Math.random()*11)+10;
        int suma=0;

        ArrayList<Integer>listaNumeros = new ArrayList<Integer>();
        
        for(int i =0; i < tamaño; i++){ //bucle para llenar los números aleatorios
            int numerosAleatorios = (int)(Math.random()*101);
            listaNumeros.add(numerosAleatorios);
            suma += numerosAleatorios; //contador para ir sumando
        }

        double media=(double)suma/tamaño;
        int max= Collections.max(listaNumeros);
        int minim= Collections.min(listaNumeros);

        //Mostrar resultados
        System.out.println("Lista generada: "+listaNumeros);
        System.out.println("-------------------------");
        System.out.println("Tamaño de la lista: "+tamaño);
        
        double mediaRedondeada = Math.round(media * 100.0) / 100.0;
        System.out.println("Media: " + mediaRedondeada);
        System.out.println("Max: "+ max);
        System.out.println("Min: "+minim);

    }
}
