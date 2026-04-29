package ArraysList;
/**
 * arrayList con for each
 */
import java.util.ArrayList;

public class EjemploArrayList03 {
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
    }
}
