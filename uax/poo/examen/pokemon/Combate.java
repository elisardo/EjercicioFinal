package uax.poo.examen.pokemon;

public class Combate {
    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador("eli");
        Entrenador entrenador2 = new Entrenador("raul");
        PokemonBase pokemon1 = null;
        PokemonBase pokemon2 = null;
        try {
            pokemon1 = new PokemonBase("Pikachu", 100, 100, 100, 100, 100, 100);
            pokemon2 = new PokemonBase("Manolo", 100, 100, 100, 100, 100, 100);
        } catch (PokemonMalCreadoException e) {
            e.printStackTrace();
        }
        entrenador1.agregarPokemonEquipo(pokemon1);
        entrenador2.agregarPokemonEquipo(pokemon2);
        simularCombate(entrenador1, entrenador2);
    }
    public static void simularCombate(Entrenador entrenador1, Entrenador entrenador2){
        int i = 0;
        int j = 0;
        while(i < entrenador1.getEquipo().length && j < entrenador2.getEquipo().length){
            while(entrenador1.getEquipo()[i].getPuntosDeVida() > 0 && entrenador2.getEquipo()[j].getPuntosDeVida() > 0){
                entrenador1.getEquipo()[i].atacar(entrenador2.getEquipo()[j]);
                entrenador2.getEquipo()[j].atacar(entrenador1.getEquipo()[i]);
            }
            if(entrenador1.getEquipo()[i].getPuntosDeVida() <= 0){
                System.out.println(entrenador1.getNombre() + " ha ganado al pokemon " + entrenador2.getEquipo()[j].getNombre());
                entrenador1.getEquipo()[i].ganarExperiencia(10);
                i++;
            }else{
                System.out.println(entrenador2.getNombre() + " ha ganado al pokemon " + entrenador1.getEquipo()[i].getNombre());
                entrenador2.getEquipo()[j].ganarExperiencia(10);
                j++;
            }
        }
    }
}
