/**
 * Escribe un programa que pida al usuario introducir números por teclado para obtener la media
 * de todos los números introducidos. Cuando se inserte un cero, el programa dejará de pedir números
 * y usará los que haya introducido antes para calcular la media aritmética.
 */
package uax.poo.practicas;

import java.util.Scanner;

public class Ej5CalcularMedia {
    public static void main(String[] args) {
        int suma,cant,valor,promedio;
        Scanner sc = new Scanner(System.in);
        suma=0;
        cant=0;
//recogemos los valores y los almacenamos hasta que valor sea 0
        do{
            System.out.println("Introduce un numero (0 para terminar):");
            valor=sc.nextInt();
            if (valor !=0){
                suma=suma+valor;
                cant++;
            }
        }while (valor!=0);
  // Calculamos la media de los valores
       if (cant!=0){
           promedio=suma/cant;
           System.out.println("La media de los numeros introducidos es: "+promedio);
       }else{
           System.out.println(("ERROR: No se han introducido numeros."));
       }
    }
}
