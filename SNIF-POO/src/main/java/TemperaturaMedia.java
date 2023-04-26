/* Crea una aplicación que solicite al usuario la temperatura de una serie de
        días y muestre al final la media. Para ello la aplicación debe solicitar la temperatura de
        un día y preguntar si desea introducir otra
        * */

        import java.util.Scanner;

public class TemperaturaMedia {

    public static void main(String[] args) {
        float temperatura;
        float sumatorio = 0;
        float contador = 0;
        float media;
        String respuesta;
        Scanner entrada = new Scanner(System.in);

        do {
            //solicitar temperatura
            System.out.println("Introduce temperatura: ");
            temperatura = entrada.nextFloat();
            //Acumular temperaturas
            sumatorio = sumatorio + temperatura;
            //contabilizar entradas
            contador++;
            System.out.println("Continuar (S/N)?: ");
            respuesta = entrada.next();
        } while (!respuesta.equals("N"));
        //visualizar la media
        media = sumatorio / contador;
        //System.out.println("La media es: " + String.valueOf(media));
        System.out.println("La media es: "+ media);

    }

}

