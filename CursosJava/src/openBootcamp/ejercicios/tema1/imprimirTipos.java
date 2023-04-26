package openBootcamp.ejercicios.tema1;

/**
 * 1-Declarar variables de distintos tipos
 * 2-Imprimir todas las variables
 */
public class imprimirTipos {
    public static void main(String[] args) {
       int edad= 26;
       long ingresosAmazon= 678901234; //en $/año
       double velocidadLuz=  299792.458d; //en Km/s
       String nombreCurso="Java Basico";

        System.out.println("la edad es: "+ edad);
        System.out.println("los ingresos anuales de Amazon son: "+ ingresosAmazon + " $/año");
        System.out.println("la velocidad de la luz en el vacio es: " + velocidadLuz + " Km/s");
        System.out.println("El curso es: " + nombreCurso);

    }
}
