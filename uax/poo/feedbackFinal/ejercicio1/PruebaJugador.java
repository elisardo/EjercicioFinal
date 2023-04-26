package uax.poo.feedbackFinal.ejercicio1;

public class PruebaJugador {
    public static void main(String[] args) {

        Jugador j1= new Jugador("Juan", "Enano", new Perfil(0, 0, 0));
        Jugador j2= new Jugador("Pedro", "Elfo", new Perfil(0, 0, 0));

        System.out.println("Primer jugador " + j1);
        System.out.println("Segundo jugador " + j2);

        j1.cambiarPerfil(3, 4, 5);//cambiamos los valores del perfil de los jugadores
        j2.cambiarPerfil(5, 6, 7);

        System.out.println("Cambiar el valor de los perfiles de los jugadores");
        System.out.println("Primer jugador " + j1);
        System.out.println("Segundo jugador " + j2);

        j2.intercambiaraPersonajes(j1);//intercambiamos el personaje de un jugar por el de otro jugador pasado por variable

        System.out.println("Intercambiar los personaje los jugadores");
        System.out.println("Primer " + j1);
        System.out.println("Segundo " + j2);

      //mostrar los datos del jugador ganador gnaAJugador(jugador j)
        String ganador= (j1.ganaAJugador(j2) > j2.ganaAJugador(j1))?j1.getNombre()+j1.getPerfil():j2.getNombre()+j2.getPerfil();//operador ternario
        System.out.println("Datos del jugador ganador: " + ganador);


    }

}
