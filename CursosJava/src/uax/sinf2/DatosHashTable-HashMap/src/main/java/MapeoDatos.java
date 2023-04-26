import java.util.HashMap;
import java.util.Hashtable;

public class MapeoDatos {
    public static void main(String[] args) {

        //HashMap
        System.out.println("\nUso de HashMap:");
        HashMap<Integer, String> personas = new HashMap<>();//integer= DNI, String= Nombre
        personas.put(12345678, "Juan Ortiz");
        personas.put(87654321, "Pedro Garcia");
        personas.put(12345678, "Juan Fernandez");

        for (Integer cedula: personas.keySet()) {
            System.out.printf("%s --> %s\n", cedula, personas.get(cedula));
        }

        //Hastable no se recomienda usarlo. hay que utilizar HashMap.
        System.out.println("\n\nUso de Hashtable:");
        Hashtable<Integer, String> personas2 = new Hashtable<>();//integer= DNI, String= Nombre
        personas2.put(12345678, "Juan Ortiz");
        personas2.put(87654321, "Pedro Garcia");
        personas2.put(12345678, "Juan Fernandez");

        for (Integer cedula: personas2.keySet()) {
            System.out.printf("%s --> %s\n", cedula, personas2.get(cedula));
        }
    }
}
