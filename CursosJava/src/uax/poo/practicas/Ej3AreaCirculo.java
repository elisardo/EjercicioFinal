/**
 * A partir de los datos del valor del radio introducido por teclado, crea un programa que
 * calcule el área del círculo resultante. Para ello recuerda que la fórmula para calcular
 * el área de un círculo es el producto de la CONSTANTE PI por el valor del radio al cuadrado.
 * Puedes usar la librería Math y la función pow () para calcular la potencia.
 */

package uax.poo.practicas;

import java.util.Scanner;

public class Ej3AreaCirculo {
    public static void main(String[] args) {

        double radio, area;

        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce el valor del radio del circulo: ");
        radio =sc.nextDouble();

        //Calcular el area del circulo
            area = Math.PI*Math.pow(radio,2);

        System.out.println("El area del circulo es: "+ area);

    }
}
