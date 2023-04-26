package uax.poo.examen.pokemon;

public class Entrenador  {
    //atributos
    private String nombre;
    private PokemonBase[] pokemonsCapturados;
    private PokemonBase[] equipoPokemon;



    //constructor

    public Entrenador(String nombre){
        this.nombre = nombre;
        this.pokemonsCapturados = new PokemonBase[250];
        this.equipoPokemon = new PokemonBase[6];
    }

    public void mostrarPokemonsCapturados(){
        for(int i = 0; i < pokemonsCapturados.length; i++){
            if(pokemonsCapturados[i] != null){
                System.out.println(pokemonsCapturados[i].getNombre());
            }
        }
    }

    public void mostrarEquipoPokemon(){
        for(int i = 0; i < equipoPokemon.length; i++){
            if(equipoPokemon[i] != null){
                System.out.println(equipoPokemon[i].getNombre());
            }
        }
    }

    public void agregarPokemonEquipo(PokemonBase pokemon){
        for(int i = 0; i < equipoPokemon.length; i++){
            if(equipoPokemon[i] == null){
                equipoPokemon[i] = pokemon;
                break;
            }
        }
    }

    public void mostrarPokemonCapturado(String nombre){
        for(int i = 0; i < pokemonsCapturados.length; i++){
            if(pokemonsCapturados[i] != null){
                if(pokemonsCapturados[i].getNombre().equals(nombre)){
                    System.out.println(pokemonsCapturados[i].getNombre());
                }
            }
        }
    }

    public void mostrarPokemonEquipo(String nombre){
        for(int i = 0; i < equipoPokemon.length; i++){
            if(equipoPokemon[i] != null){
                if(equipoPokemon[i].getNombre().equals(nombre)){
                    System.out.println(equipoPokemon[i].getNombre());
                }
            }
        }
    }

    public void mostrarPokemonCapturado(int nivel){
        for(int i = 0; i < pokemonsCapturados.length; i++){
            if(pokemonsCapturados[i] != null){
                if(pokemonsCapturados[i].getNivel() == nivel){
                    System.out.println(pokemonsCapturados[i].getNombre());
                }
}
            }
        }

    public PokemonBase[] getEquipo() {
        return new PokemonBase[0];
    }




    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PokemonBase[] getPokemonsCapturados() {
        return pokemonsCapturados;
    }

    public void setPokemonsCapturados(PokemonBase[] pokemonsCapturados) {
        this.pokemonsCapturados = pokemonsCapturados;
    }

    public PokemonBase[] getEquipoPokemon() {
        return equipoPokemon;
    }

    public void setEquipoPokemon(PokemonBase[] equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }




}
