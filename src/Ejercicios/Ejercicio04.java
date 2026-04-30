package Ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Realiza un programa equivalente al anterios pero en esta ocasión,
 * el programa tiene que ordenar palabras en vez de números.
 * 
*/
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> ListaPalabras = new ArrayList<String>();
        String palabra;

        System.out.println("Introduce 10 palabras: ");
        for(int i =0; i< 10; i++){
            System.out.println("Palabra "+(i+1)+": ");
            palabra=sc.nextLine();
            ListaPalabras.add(palabra);
        }
        Collections.sort(ListaPalabras);

        System.out.println("\nListado de las palabras");
        for(String n: ListaPalabras){
            System.out.println(n);
        }
    }
}
