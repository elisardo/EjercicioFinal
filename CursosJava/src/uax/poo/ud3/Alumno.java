package uax.poo.ud3;



public class Alumno extends Persona implements Docente{

    //atributos
    private String grupo;
    private Horario horario;

//constructor

    public Alumno(String nombre, String apellidos, int id, String grupo, Horario horario) {
        super(nombre, apellidos, id);
        this.grupo = grupo;
        this.horario = horario;
    }

    //metodos
    @Override
    public void ponGrupo(String grupo, Horario horario) {
        this.grupo = grupo;
        this.horario = horario;

    }

    @Override
    public void quitarGrupo(String grupo) {
        this.grupo = "";
    }

    @Override
    public String dameGrupo() {

        return grupo;
    }

    @Override
    public Horario dameHorario() {

        return horario;
    }
}
