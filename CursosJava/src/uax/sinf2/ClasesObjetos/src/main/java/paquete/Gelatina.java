package paquete;

public class Gelatina {
    //atributos
    String color;
    String sabor;

    //Metodo Constructor (por convencion siempre va tras los atributos). Puede ser vacio.
    //Permite inicializar los atributos de una clase
    public Gelatina(String c, String s)//si creamos un constructor ya no necesitamos inicializarlos en el principal
    {
        this.color =c;
        this.sabor =s;
    }

    //Metodos Getter
    public String getColor() {
            return this.color;
    }

    public String getSabor() {
        return this.sabor;
    }

    //Metodos Setter
    public void setColor(String c){
        this.color = c;
    }

    public void setSabor(String s){
        this.sabor = s;
    }

    //Metodo para obtener toda la informacion de nuestros atributos
    public void mostrarInfo(){
        System.out.println("La informacion de la gelatina es: ");
        System.out.println("Sabor: "+ getSabor());
        System.out.println("Color: "+ getColor());
    }
}
