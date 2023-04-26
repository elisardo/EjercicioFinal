package uax.poo.feedbackFinal.ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CalcularMedia {
    public static void main(String[] args) throws IOException{

        String rutaArchivo= "C:\\Users\\Eli\\IdeaProjects\\uax\\poo\\feedbackFinal\\ejercicio4\\";
        String nombreArchivo = "datos.txt";
        String fileName = rutaArchivo + nombreArchivo;

        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file); //identificamos el archivo a leer
            BufferedReader bufferedReader= new BufferedReader(fileReader); //leemos el archivo

            String linea=null;
            int cuentaLineas=0; //el numero de lineas-1 es el numero de personas (por el encabezado)
            float peso=0;
            float altura=0;
            float mediaPeso=0;
            float mediaAltura=0;


            System.out.println("------INICIO DEL CONTENIDO DEL ARCHIVO A LEER--------------");
            while((linea = bufferedReader.readLine()) != null) {//si la linea no esta vacia...
                System.out.println(linea);
                if(cuentaLineas==0){//si es la primera linea (encabezado) no hacemos nada
                    cuentaLineas++;
                    continue;
                }
                String[] datos = linea.split(",");//creamos un array con los datos (separados por comas) de la linea del fichero
                peso+=Float.parseFloat(datos[1]);//convertimos el string de la posicion [1] a float y lo sumamos al peso
                altura+=Float.parseFloat(datos[2]);
                cuentaLineas++;
            }
            System.out.println("------FIN DEL CONTENIDO DEL ARCHIVO LEIDO--------------");

            bufferedReader.close();
            System.out.println("El fichero LEIDO contiene "+(cuentaLineas-1)+" personas");//no contamos el encabezado
            System.out.println("La media del peso es: "+peso/(cuentaLineas-1));
            System.out.println("La media de la altura es: "+altura/(cuentaLineas-1));

        }catch (IOException e){
            System.out.println("ERROR al leer el fichero: "+fileName);
        }
    }
}
