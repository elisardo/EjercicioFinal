package uax.poo.examen.pokemon;

public interface Impresion {

    public static void imprimirTodo(){
        String nombre = null;
        String nivel= null;
        String ataque=  null;
        String defensa= null;
        String experiencia= null;
        String puntosDeVida= null;
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de vida: " + puntosDeVida);
    };
}
