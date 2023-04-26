package openBootcamp.basic;

public class Tipos {
    public static void main(String[] args) {
        //enteros
        byte numero1=1; // 1 byte
        short numero2=2; //2 byte
        int numero3=3; //4 byte
        long numero4=4; //8 byte

        //punto flotante
        float decimal1= 4.9f; //debe terminar en f de float para no confundir con double
        double decimal2= 9.99d; //puede terminar en d de double

        //caracter
        char caracter1='a';

        //boolean
        boolean verdadero=true;
        boolean falso=false;

        //cadenas de texto
       //son especiales porque involucran utilizar de una clase. Ver en POO
        String nombre="Eli";
        String apellido="Alvarez";

        //tipos envoltorio. Comienzan en mayúscula al contrario que los tipos primitivos.
        Integer numero5=null; //pueden ser nulos
        Long numero6=2L;


    }
}
