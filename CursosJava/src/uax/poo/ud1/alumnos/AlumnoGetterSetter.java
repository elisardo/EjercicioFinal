package uax.poo.ud1.alumnos;

/**
 * Utilizamos Getter para obtener(leer) un nombre de un atributo private
 * utilizamos Setter para cambiar(escribir) un nombre de un atributo private
 * los getters y setters se declaran en los metodos
 * P.E. pongamos el atributo nombre "private"
 */
public class AlumnoGetterSetter {
           static int numAlumnos =0;

        //atributos
        private String nombre;
        String apellidos;
        int anyoNacimiento;
        int np;
        //String dni;
        String grupo;

        //constructor
        AlumnoGetterSetter(){
        }

        public AlumnoGetterSetter(String nombre, String apellidos, int anyoNacimiento) {
            this.nombre = nombre;//" this.nombre" es la variable y "nombre" es el atributo
            this.apellidos = apellidos;
            this.anyoNacimiento = anyoNacimiento;

            numAlumnos++; //numAlumnos = numAlumnos +1;
        }

        public AlumnoGetterSetter(String nombre, int numeroPersonal, int anyoNacimiento) {
            this.nombre = nombre;//" this.nombre" es la variable y "nombre" es el atributo
            this.np = numeroPersonal;
            this.anyoNacimiento = anyoNacimiento;
        }

        //metodo Imprimir
        public static void imprimirTotalAlumnos(){
            System.out.println("El nº de alumnos es: " + numAlumnos);
        }

        /////Getters y Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
///////////////////////////////

    public static void main(String[] args) {

            imprimirTotalAlumnos();//necesita que el metodo se static. Imprime 0
            /**
             * declaramos tres objetos. Llamamos a la clase Alumno + nombre de variable  +
             * "="
             */

            uax.poo.ud1.alumnos.Alumno alumno1 = new uax.poo.ud1.alumnos.Alumno("Blanca","Sanchez",1998);
            uax.poo.ud1.alumnos.Alumno alumno2 = new uax.poo.ud1.alumnos.Alumno("Alicia","Sanchez",1990);
            uax.poo.ud1.alumnos.Alumno alumno3 = new uax.poo.ud1.alumnos.Alumno("Alejandra","Moreno",2000);

            imprimirTotalAlumnos();// Imprime 3

            //vamos a imprimir el nombre de los alumnos
            System.out.println(alumno1.nombre);
            System.out.println(alumno2.nombre);
            System.out.println(alumno3.nombre);

            //vamos a cambiar el nombre al alumno3
            alumno3.nombre = "Alex";

            System.out.println(alumno1.nombre);
            System.out.println(alumno2.nombre);
            System.out.println(alumno3.nombre);
        }
    }

