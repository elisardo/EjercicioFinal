package uax.poo.feedbackFinal.ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuardarDatos {

    public static void main(String[] args) throws IOException{

        ArrayList<Persona> personas = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        float peso;
        float altura;
        String resp;
        String nombreArchivo= "datosPersonas.txt";
        String archivoPrueba= "datosPrueba.txt";
        String rutaArchivo= "C:\\Users\\Eli\\IdeaProjects\\uax\\poo\\feedbackFinal\\ejercicio6\\";

        String fichero= rutaArchivo + nombreArchivo;
        String ficheroPrueba= rutaArchivo + archivoPrueba;

        try{
            BufferedReader br=new BufferedReader(new FileReader(ficheroPrueba));
            FileWriter fw = new FileWriter(fichero);//creamos el fichero copia y lo guardamos en el buffer de escritura
            String linea=null;

            do {
                System.out.println("Introduce el nombre de la persona");
                nombre = sc.nextLine();
                System.out.println("Introduce el peso de la persona");
                peso = sc.nextFloat();
                System.out.println("Introduce la altura de la persona");
                altura = sc.nextFloat();
                sc.nextLine();
                Persona p = new Persona(nombre, peso, altura);
                personas.add(p);
                fw.write(p.toString() + "\n"); //escribimos en el fichero el contenido introducido
                System.out.println("¿Desea introducir otra persona? (s/n)");
                resp = sc.nextLine();
            } while (resp.equalsIgnoreCase("s"));

            fw.close();//cerramos el fichero copia
            System.out.println("Se han introducido los siguientes datos:");
            for (Persona persona : personas) {//recorremos el arraylist para mostrar los datos introducidos
                System.out.println(persona);
            }

        }catch (IOException e){
            System.out.println("ERROR");
        }
        System.out.println("============LOS DATOS RECUPERADOS DEL FICHERO DE PRUEBA SON:===========");
        try{
            FileReader fr = new FileReader(ficheroPrueba);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            System.out.println("===========FIN DE LOS DATOS RECUPERADOS================");
            br.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }


    }


}
