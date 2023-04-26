package paquete;

public class Principal {
    public static void main(String[] args) {
        //Crear un objeto a partir de una clase-Instancia

        String nom_var ="Texto";
/* Si utilizamos un constructor en Geletina, debemos pasar los parametros dentro de los atributos
        Gelatina g1 = new Gelatina();
       //caracteristicas
        //g1.setColor("Verde");  (
       // g1.setSabor("Limon");
*/
        Gelatina g1 =new Gelatina("Amarillo","Piña");
        //funcionalidades
        g1.mostrarInfo();

        //otra nueva instancia
        //Gelatina g2 = new Gelatina();
        //g2.setSabor("Fresa");
        //g2.setColor("Rojo");
        Gelatina g2 =new Gelatina("Marron","Cola");
        g2.mostrarInfo();
        //nueva gelatina de color azul y sabor gin.
        Gelatina g3 =new Gelatina("Azul","Gin");
        g3.mostrarInfo();


    }
}
