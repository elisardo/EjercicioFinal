package uax.poo.ud3;

public interface Docente {
    void ponGrupo(String grupo, Horario horario);
    void quitarGrupo(String grupo);


    String dameGrupo();
    Horario dameHorario();
}
