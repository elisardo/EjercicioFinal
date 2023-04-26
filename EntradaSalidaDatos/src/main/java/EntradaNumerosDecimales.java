import javax.swing.JOptionPane;
public class EntradaNumerosDecimales {
    public static void main(String[] args) {
        double x=10000.0;

        System.out.println(x/3  );
//vamos a limitar el num de decimales con printf (print formato)
        System.out.printf("%1.2f", x/3);
        String num1=JOptionPane.showInputDialog("Introduce un numero");//el par"se para doble es: Double.parseDouble
        double num2=Double.parseDouble(num1);
        System.out.print("La raiz de "+num2+" es: ");//imprimimos sin retorno de carro
        System.out.printf("%1.2f", Math.sqrt(num2));//damos formato a los decimales

    }
}
