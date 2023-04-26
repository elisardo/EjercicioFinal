import util.java.Scanner;

public class suma {
    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = entrada.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}
