package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y 
 * almacenados en un objeto de la clase ArrayList.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumero = new ArrayList<Integer>();
        int numero;

        System.out.println("Introduce 10 números enteros: ");

        //creo el bucle para la impresión de los números
        for(int i =0; i < 10; i++){
            System.out.println("Número: " + (i+1));
            numero= sc.nextInt();
            listaNumero.add(numero);
        }


    }
}
