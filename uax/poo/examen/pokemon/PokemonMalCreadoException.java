package uax.poo.examen.pokemon;
//Si no se puede crear el Pokemon
//porque los valores introducidos son incorrectos, se debe generar la
//excepción "PokemonMalCreadoException" que indique por pantalla
//“Valores incorrectos”

public class PokemonMalCreadoException extends Exception {
    public PokemonMalCreadoException(String mensaje){
        super(mensaje);
    }

}
