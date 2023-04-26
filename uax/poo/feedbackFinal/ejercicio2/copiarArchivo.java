package uax.poo.feedbackFinal.ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copiarArchivo {

    public static void main(String[] args) throws IOException {
        //copiar el fichero palabras.txt en el fichero copia.txt

        String archivoOrigen= "palabras.txt";
        String archivoDestino= "copia.txt";

        String rutaArchivo= "C:\\Users\\Eli\\IdeaProjects\\uax\\poo\\feedbackFinal\\ejercicio2\\";

        String ficheroOriginal= rutaArchivo + archivoOrigen;
        String ficheroCopiado=  rutaArchivo + archivoDestino;

        try{
            BufferedReader br = new BufferedReader(new FileReader(ficheroOriginal));//guardamos en el buffer de lectura el fichero original
            FileWriter fw = new FileWriter(ficheroCopiado);//creamos el fichero copia y lo guardamos en el buffer de escritura
            String linea=null; //para guardar las lineas del fichero original
            while((linea =br.readLine()) != null){ //mientras la linea no esté vacia
                fw.write(linea + "\n"); //escribimos en el fichero copia la linea del fichero original
            }
            br.close(); //cerramos el fichero original
            fw.close();//cerramos el fichero escrito

        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
