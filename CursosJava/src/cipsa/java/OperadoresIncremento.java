import java.util.Scanner;

public class OperadoresIncremento {
    public  static void  main(String[] args){
        int x=0;
        int b= x++;     //Postincremento
        System.out.println(b); //Muestra 0
        System.out.println(x); //Muestra 1
        x=0;
        b= ++x;          //Preincremento
        System.out.println(b); //Muestra 1
        System.out.println(x); //Muestra 1
    }
}
