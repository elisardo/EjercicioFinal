package uax.poo.ud1.alumnos;

public class TestingGetterSetter {


    public static void main(String[] args) {
        AlumnoGetterSetter alumno102 = new AlumnoGetterSetter("Raul","Garcia",1993);

        System.out.println(alumno102.getNombre());

        alumno102.setNombre("Manuel");
        System.out.println(alumno102.getNombre());
    }
}
