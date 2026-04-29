package ArraysList;

import java.util.ArrayList;

public class EjemploArrayList06 {
    public static void main(String[] args) {
        ArrayList<String>a = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");

        System.out.println("Contenido de la lista: ");
        System.out.println(a);

        a.add("turquesa");

        System.out.println();
    }
}
