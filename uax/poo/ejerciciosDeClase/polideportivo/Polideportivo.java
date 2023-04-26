package uax.poo.ejerciciosDeClase.polideportivo;

//Vamos a hacer un programa para gestionar los recursos asignados a cada deporte de nuestro polideportivo. Usaremos un único fichero de nombre “recursos.txt”.




public class Polideportivo  {
    public static void main(String[] args) {
        //crear dos nuevas instalaciones. una piscina y una sala de yoga
        Instalaciones piscina = new Instalaciones("BOX01", "Natación", 5, "Piscina de 25 metros", true);
        Instalaciones salaYoga = new Instalaciones("YOG03", "Yoga", 6, "Sala de yoga", true);

        //crear dos nuevos recursos. una pista de atletismo y una pista de tenis
        Recurso pistaAtletismo = new Recurso("ATL01", "Atletismo", 4);
        Recurso pistaTenis = new Recurso("TEN01", "Tenis", 4);

        //crear seis nuevos cursos en distintos horarios y niveles. dos de natación y dos de yoga uno de tenis y otro de atletismo
        Persona[] personasInscritas = new Persona[10];
        Cursos cursoNatacion1 = new Cursos("NAT01", "Natación", 10, "Iniciación", "01/01/2019", "01/02/2019", 50, personasInscritas);
        Cursos cursoNatacion2 = new Cursos("NAT02", "Natación", 10, "Perfeccionamiento", "01/02/2019", "01/03/2019", 50, personasInscritas);
        Cursos cursoYoga1 = new Cursos("YOG01", "Yoga", 20, "Iniciación", "01/01/2019", "01/02/2019", 50, personasInscritas);
        Cursos cursoYoga2= new Cursos("YOG02", "Yoga", 20, "Perfeccionamiento", "01/02/2019", "01/03/2019", 50, personasInscritas);
        Cursos cursoTenis =new Cursos("TEN01", "Tenis", 4, "Iniciación", "01/01/2019", "01/02/2019", 50, personasInscritas);
        Cursos cursoAtletismo = new Cursos("ATL01", "Atletismo", 100, "Iniciación", "01/01/2019", "01/02/2019", 50, personasInscritas);

        //inscribir a 37 personas a los distintos cursos y niveles. en ningun curso se puede superar el aforo máximo. una persona puede estar inscrita a varios cursos que no se solapen en el tiempo

        Persona persona1 = new Persona("12345678A", "Juan");
        Persona persona2 = new Persona("12345678B", "Pedro");
        Persona persona3 = new Persona("12345678C", "Luis");
        Persona persona4 = new Persona("12345678D", "Ana");
        Persona persona5 = new Persona("12345678E", "Maria");
        Persona persona6 = new Persona("12345678F", "Jose");
        Persona persona7 = new Persona("12345678G", "Antonio");
        Persona persona8 = new Persona("12345678H", "Rosa");
        Persona persona9 = new Persona("12345678I", "Luisa");
        Persona persona10 = new Persona("12345678J", "Marta");
        Persona persona11 = new Persona("12345678K", "Pablo");
        Persona persona12 = new Persona("12345678L", "Javier");
        Persona persona13 = new Persona("12345678M", "Jorge");
        Persona persona14 = new Persona("12345678N", "Sara");
        Persona persona15 = new Persona("12345678O", "Laura");

        cursoNatacion1.inscribirPersona(persona1);
        cursoNatacion1.inscribirPersona(persona2);
        cursoNatacion1.inscribirPersona(persona3);
        cursoNatacion1.inscribirPersona(persona4);
        cursoNatacion1.inscribirPersona(persona5);
        cursoNatacion1.inscribirPersona(persona6);
        cursoNatacion1.inscribirPersona(persona7);
        cursoYoga1.desinscribirPersona(persona15);
        cursoYoga1.inscribirPersona(persona8);
        cursoYoga1.inscribirPersona(persona9);
        cursoYoga1.inscribirPersona(persona10);
        cursoYoga1.inscribirPersona(persona11);
        cursoYoga2.inscribirPersona(persona12);
        cursoYoga2.inscribirPersona(persona13);
        cursoYoga2.inscribirPersona(persona14);
        cursoYoga2.inscribirPersona(persona15);
        cursoYoga2.inscribirPersona(persona1);
        cursoAtletismo.inscribirPersona(persona2);
        cursoAtletismo.inscribirPersona(persona3);
        cursoAtletismo.inscribirPersona(persona4);
        cursoAtletismo.inscribirPersona(persona5);
        cursoTenis.inscribirPersona(persona6);
        cursoTenis.inscribirPersona(persona7);
        cursoTenis.inscribirPersona(persona8);
        cursoTenis.inscribirPersona(persona9);
        cursoNatacion2.inscribirPersona(persona10);
        cursoNatacion2.inscribirPersona(persona11);
        cursoNatacion2.inscribirPersona(persona12);
        cursoNatacion2.inscribirPersona(persona13);

//listar las personas inscritas a cada curso
        cursoNatacion1.mostrarPersonasInscritas();
        cursoNatacion2.mostrarPersonasInscritas();
        cursoYoga1.mostrarPersonasInscritas();
        cursoYoga2.mostrarPersonasInscritas();
        cursoAtletismo.mostrarPersonasInscritas();
        cursoTenis.mostrarPersonasInscritas();













    }
}
