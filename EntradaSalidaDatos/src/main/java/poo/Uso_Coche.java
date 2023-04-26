package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche Renault=new Coche();//instanciamos la clase creando los objetos
        System.out.println("El coche tiene "+Renault.ruedas+" ruedas");
        System.out.println("El coche tiene un largo de "+Renault.largo+" cm");
        System.out.println("El coche tiene un ancho de "+Renault.ancho+" cm");
        System.out.println("El coche tiene un motor de "+Renault.motor+" cc");
        System.out.println("El coche tiene un peso de "+Renault.peso_plataforma+" kg");

    }
    Coche miMarca=new Coche();//instanciamos la clase creando los objetos
   // miMarca.establece_color("azul");//llamamos al metodo constructor setter
   // System.out.println (miMarca.dime_color ());//llamamos al metodo constructor getter
}
