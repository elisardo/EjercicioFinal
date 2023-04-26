/**
 * Crea un programa en Java que a partir de la clase Triángulo,
 * tenga como atributos los lados del mismo y como métodos pueda
 * mostrar el valor del lado más grande y que pueda indicar si el triángulo es equilátero o no.
 */
package uax.poo.practicas;

import uax.poo.ud2.Triangulo;

import java.util.Scanner;

public class Ej6Triangulo {
   //atributos

        Scanner sc=new Scanner(System.in);
        int lado1,lado2,lado3;

   //constructores

    public Ej6Triangulo() {
    }


   //metodos
   private void inicializar() {
       System.out.println("Introduce las mediadas de los lados del triangulo:");
       System.out.println("Mediad del lado1:");
       lado1=sc.nextInt();
       System.out.println("Medida del lado2:");
       lado2=sc.nextInt();
       System.out.println("Medida del lado3:");
       lado3=sc.nextInt();
   }
    public void ladoMayor(){
        System.out.println("El lado mayor es: ");
        if (lado1>lado2 && lado1>lado3){
            System.out.println(lado1);
        }else {
            if (lado2>lado3){
                System.out.println(lado2);
            }else{
                System.out.println(lado3);
            }
        }
    }

    public void esEquilatero(){
       if(lado1==lado2 && lado2==lado3) {
           System.out.println("Es un triangulo Equilatero");
       }else{
           System.out.println("No es un triangulo Equilátero");
       }
   }

    public static void main(String[] args) {
        Ej6Triangulo triangulo = new Ej6Triangulo();
        triangulo.inicializar();
        triangulo.ladoMayor();
        triangulo.esEquilatero();
    }


}
