package HashMap;

import java.util.HashMap;

public class EjemploHashMap04 {
    public static void main(String[] args) {

        HashMap<Integer,String>m=new HashMap<Integer,String>();

        m.put(924,"Amalia Núñez" );
        m.put(921,"Cindy Nero" );
        m.put(700,"César Vázquez" );
        m.put(219,"Víctor Tilla" );
        m.put(537,"Alan Brito" );
        m.put(605,"Esteban Quito" );

        System.out.println("Por favor, introduzca un código: ");
        int codigoIntroducido = Integer.parseInt(System.console().readLine());

        if(m.containsKey(codigoIntroducido)){ //El "containsKey" sirve para saber si existe o no una determinada clave en un dicccionario
            System.out.print("El código "+ codigoIntroducido+" corresponde a ");
            System.out.println(m.get(codigoIntroducido));//El"get"sirve para extraer un valor a partir de su clave
        }else{
            System.out.println("El código introducido no existe.");
        }
    }
}
