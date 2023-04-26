import javax.swing.JOptionPane;

public class EntradaEjemplo2 {
    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad=JOptionPane.showInputDialog("Introduce tu edad");//el metodo showInputDialog devuelve un string y no un Int
        System.out.println("Hola " + nombre_usuario + " tienes " + edad + " años");
        System.out.println("Hola " + nombre_usuario + " el año que viene tendrás " + (edad+1) + " años");
        //no se puede hacer una suma de string con un int. Hay que hacer un parseInt.
        int edad_int = Integer.parseInt(edad);
        System.out.println("Hola " + nombre_usuario + " el año que viene tendrás " + (edad_int+1) + " años");


    }
}
