package uax.poo.examen.pokemon;

public class PokemonLegendario extends PokemonBase implements Impresion, Capturable {

    //atributos
    private String raridad;
    private boolean habilidadExclusiva;

    //constructores
    public PokemonLegendario(String nombre, String raridad, boolean habilidadExclusiva) throws PokemonMalCreadoException {
        super(nombre);
        this.raridad = raridad;
        this.habilidadExclusiva = habilidadExclusiva;
        if(raridad.equals("comun") || raridad.equals("raro") || raridad.equals("legendario")){
            throw new PokemonMalCreadoException("Valores incorrectos");
        }
    }

    //metodos


    //getter y setter

    public String getRaridad() {
        return raridad;
    }

    public void setRaridad(String raridad) {
        this.raridad = raridad;
    }

    public boolean isHabilidadExclusiva() {
        return habilidadExclusiva;
    }

    public void setHabilidadExclusiva(boolean habilidadExclusiva) {
        this.habilidadExclusiva = habilidadExclusiva;
    }
    //Sobrescribe el método "atacar" para tener en cuenta si tiene una habilidad
    //exclusiva o no. El método “atacar” recibirá por parámetro un pokemon
    //objetivo y calculará su daño con la siguiente formula:
    //• Si el pokemon tiene habilidad exclusiva se usará esta fórmula
    //o daño = ((nivel*2) * (ataque/50)) * 5
    //• Si no se usará esta otra fórmula:
    //o daño = (nivel*2) * (ataque/50)
    //• El nivel, el ataque y la defensa son atributos del pokemon atacante.
    //Después de calcular del daño se le restará del atributo vida del pokemon
    //objetivo.
    @Override
    public void atacar(PokemonBase pokemon) {
        int danio;
        if(habilidadExclusiva){
            danio = ((nivel*2) * (ataque/50)) * 5;
        }else{
            danio = (nivel*2) * (ataque/50);
        }
        pokemon.puntosDeVida -= danio;
    }


}