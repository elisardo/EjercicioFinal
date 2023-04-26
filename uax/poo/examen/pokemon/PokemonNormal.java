package uax.poo.examen.pokemon;

public class PokemonNormal extends PokemonBase implements Impresion, Capturable {

    //atributos
    private String tipo;
    private boolean habilidadEspecial;

    //constructores
    public PokemonNormal(String nombre, String tipo, boolean habilidadEspecial) throws PokemonMalCreadoException {
        super(nombre);
        this.tipo = tipo;
        this.habilidadEspecial = habilidadEspecial;
        if(tipo.equals("agua") || tipo.equals("fuego") || tipo.equals("planta")){
            throw new PokemonMalCreadoException("Valores incorrectos");
        }
    }

    //getter y setter


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(boolean habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void atacar(PokemonBase pokemon) {
        int danio;
        int nivel = pokemon.getNivel();
        int ataque = pokemon.getAtaque();
        int defensa = pokemon.getDefensa();

        if(habilidadEspecial){
            danio = ((nivel*2) * (ataque/50)) * 2;
        }else{
            danio = (nivel*2) * (ataque/50);
        }
        pokemon.puntosDeVida -= danio;
    }

    @Override
    public void capturar() {
        System.out.println("El pokemon " + nombre + " ha sido capturado");
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de vida: " + puntosDeVida);
        System.out.println("Tipo: " + tipo);
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }


}

