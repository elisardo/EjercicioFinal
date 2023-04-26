package openBootcamp.basic;

public class Funciones {
    public static void main(String[] args) {
        
        holaMundo(); //vamos acrear una funcion mas abajo
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
        holaMundo("Eli"); //Doy argumentos o parametros a la funcion
        holaMundo("Paco");
        String  textoRecibido=devolverHolaMundo(); //asignamos el retorno de la funcion a textoRecibido
        System.out.println(textoRecibido); //imprimimos la variable
    }

    private static void holaMundo() { //esto es una funcion o un Metodo cuando hablemos de POO
        System.out.println("Hola Mundo desde un Metodo");
    }
    private static void holaMundo(String name){ //esta es una funcion con parametros
        System.out.println("Hola " + name);
    }
    private static String devolverHolaMundo(){ // va a devolver un String
        return "Devolver este texto";   //vamos a devolver este texto
    }
}
