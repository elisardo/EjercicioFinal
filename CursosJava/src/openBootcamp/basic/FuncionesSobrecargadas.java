package openBootcamp.basic;

public class FuncionesSobrecargadas {
    public static void main(String[] args) {

        holaMundo();
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
        holaMundo("Eli");
        holaMundo("Paco","Paquete");
        holaMundo(34);

        String  textoRecibido=devolverHolaMundo();
        System.out.println(textoRecibido);
    }
/*
Podemos ver que tenemos la misma función "holaMundo" y no da error porque en el argumento
le pasamos parametros distintos
 */
    private static void holaMundo() { //esto es una funcion o un Metodo cuando hablemos de POO
        System.out.println("Hola Mundo desde un Metodo");
    }
    private static void holaMundo(String name){ //esta es la misma funcion con parametros
        System.out.println("Hola " + name);
    }
    private static void holaMundo(String name, String surname){ //esta es la misma funcion con más parametros
        System.out.println("Hola " + name + " " + surname);
    }
    private static void holaMundo(Integer number){ //esta es la misma funcion con distintos parametros
        System.out.println("Hola Mundo esto es el numero " + number);
    }
    private static String devolverHolaMundo(){ // va a devolver un String
        return "Devolver este texto";   //vamos a devolver este texto
    }
}
