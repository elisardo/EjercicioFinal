package uax.poo.ud3;

import openBootcamp.poo.sinInterfaces.Empleado;

public class Profesor extends Empleado implements Docente {

    String grupo;
    boolean esMatutino;


    @Override
    public void ponGrupo(String grupo, Horario horario) {
        this.grupo = grupo;
        //esMatutino =(horario =="Horario.MAÑANA");
        esMatutino = true;
    }

    @Override
    public void quitarGrupo(String grupo) {

    }

    @Override
    public String dameGrupo() {
        return grupo;
    }

    @Override
    public Horario dameHorario() { //está sin implementar
        return null;
    }
}
