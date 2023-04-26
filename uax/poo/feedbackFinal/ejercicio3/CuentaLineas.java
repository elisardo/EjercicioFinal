package uax.poo.feedbackFinal.ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CuentaLineas {
    public static void main(String[] args) throws IOException {

        String rutaArchivo= "C:\\Users\\Eli\\IdeaProjects\\uax\\poo\\feedbackFinal\\ejercicio2\\";//utilizo el archivo del ejercicio2
        String nombreArchivo= "palabras.txt";

        String ficheroTexto= rutaArchivo + nombreArchivo;

        //contar el número de líneas que tiene el fichero palabras.txt
        try{
            File file = new File(ficheroTexto);
            FileReader fileReader = new FileReader(file); //identificamos el archivo a leer
            BufferedReader bufferedReader= new BufferedReader(fileReader); //leemos el archivo

            String linea=null;
            int cuentaLineas=0;

            System.out.println("------INICIO DEL CONTENIDO DEL ARCHIVO A LEER--------------");
                while((linea = bufferedReader.readLine()) != null) {//si la linea no esta vacia...
                    System.out.println(linea);
                    cuentaLineas++;

                }
            System.out.println("------FIN DEL CONTENIDO DEL ARCHIVO LEIDO--------------");

            bufferedReader.close();
            System.out.println("El fichero LEIDO contiene "+cuentaLineas+" lineas");

        }catch (IOException e){
            System.out.println("ERROR al leer el fichero: "+ficheroTexto);
        }

    }
}
