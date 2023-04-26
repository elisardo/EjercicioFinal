package openBootcamp.ejercicios.tema3;

public class ConcatenarTexto {

    public static void main(String[] args) {
        String[] nombres ={"Paco","Luis", "Lolo"};
        String nombresSeguidos="";
        String nombresSeguidos2 = "";
        for (int i=0; i<nombres.length; i++){

            nombresSeguidos= nombresSeguidos.concat(nombres[i]+ " ");//funcion concat
            nombresSeguidos2= nombresSeguidos2 + nombres[i]+" ";//operador +
        }
        System.out.println(nombresSeguidos);

        System.out.println(nombresSeguidos2);

    }
}
