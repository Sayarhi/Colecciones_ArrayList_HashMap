package HashMap;

import java.util.HashMap;

public class EjemploHasMap01 {
    public static void main(String[] args) {
        HashMap<Integer, String>m= new HashMap<Integer,String>();

        m.put(924,"Amelia Nuñez");
        m.put(921,"Cindy Nero");
        m.put(700, "César Váquez");
        m.put(219,"Victor Tilla");
        m.put(573, "Alan Brito");
        m.put(605, "Esteban Quito");

        System.out.println("Los elementos de m son: \n"+m);
    }
}
