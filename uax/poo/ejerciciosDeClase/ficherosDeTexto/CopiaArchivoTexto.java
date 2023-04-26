package uax.poo.ejerciciosDeClase.ficherosDeTexto;

import java.io.*;

public class CopiaArchivoTexto {


    //metodo para encapsular la escritura de ficheros
    static void escribirMensaje(String rutaFicheroSalida, String mensaje) throws IOException {

        File file = new File(rutaFicheroSalida);
        FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(mensaje);
            fileWriter.close();

    }

    //metodo para COPIAR ficheros
    static void copiarFichero(String ficheroEntrada, String ficheroSalida){ //siempre utilizamos try-catch
        try {
            /*FileReader fileReaderOrigen = new FileReader(fileOrigen); //identificamos el archivo a leer
            BufferedReader bufferedReaderOrigen = new BufferedReader(fileReaderOrigen); //leemos el archivo*/
            BufferedReader br = new BufferedReader(new FileReader(ficheroEntrada));
            FileWriter fw = new FileWriter(ficheroSalida);
            String linea;
            while((linea =br.readLine()) != null){
                fw.write(linea + "\n");

            }
            br.close();
            fw.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }

    }


    public static void main(String[] args) {

        //archivos de texto
        String nombreArchivoOrigen = "archivoTextoOrigen.txt";
        String nombreArchivoDestino = "archivoTextoDestino.txt";


        String rutaArchivoOrigen = "C:\\Users\\Eli\\IdeaProjects\\uax\\poo\\ejerciciosDeClase\\ficherosDeTexto\\";
        String rutaArchivoDestino = "C:\\Users\\Eli\\IdeaProjects\\uax\\poo\\ejerciciosDeClase\\ficherosDeTexto\\";

        String fileNameOrigen = rutaArchivoOrigen + nombreArchivoOrigen;
        System.out.println(fileNameOrigen);

        String fileNameDestino = rutaArchivoDestino + nombreArchivoDestino;//podríamos indicar el "nombreArchivoDestino.txt" directamente y lo crearía
        String fileNameDestino2 = rutaArchivoDestino + "nombreArchivoDestino2.txt";
        String fileCopiado = rutaArchivoDestino + "ficheroCopiado.txt";
        System.out.println(fileNameDestino);
        System.out.println(fileNameDestino2);
        System.out.println("fichero COPIADO " + fileCopiado);

        int contarLineas=0;
        int contarPalabras=0;

        try{
            File fileOrigen = new File(fileNameOrigen);
            File fileDestino = new File(fileNameDestino);
            File fileDestino2 = new File(fileNameDestino2);
            File fileDestino3 = new File(fileCopiado);

            /*creamos un fichero de salida con el texto pasado por parametro*/
            escribirMensaje(fileNameDestino2, "UAX. Universidad Alfonso X el Sabio");

            /* hacemos una COPIA de un fichero*/
            copiarFichero(fileNameOrigen,fileCopiado);

            FileWriter fileWriter = new FileWriter(fileDestino);//abrimos el archivo
            fileWriter.write("Hola mundo");//vamos a SOBRESCRIBIR el archivo indicado de DESTINO
            fileWriter.write("\n");
            fileWriter.write("Segunda linea de texto para mi nuevo archivo de texto");
            fileWriter.close();//cerramos el archivo (no tenemos buffers como en lectura)

            /* leemos archivo origen*/
            FileReader fileReaderOrigen = new FileReader(fileOrigen); //identificamos el archivo a leer
            BufferedReader bufferedReaderOrigen = new BufferedReader(fileReaderOrigen); //leemos el archivo


            /* leemos archivo destino*/
            FileReader fileReaderDestino = new FileReader(fileDestino);
            BufferedReader bufferedReaderDestino = new BufferedReader(fileReaderDestino);

            String linea=null; //para guardar la linea que estamos leyendo

            System.out.println("------INICIO DEL CONTENIDO DEL ARCHIVO ORIGEN--------------");
            while((linea = bufferedReaderOrigen.readLine()) != null){
                System.out.println(linea);
                contarPalabras = linea.split("\\s+").length;//utilizamos split para separar los strigs por espacios
                //contar lineas
                contarLineas++;
                contarPalabras++;
            }
            System.out.println("------FIN DEL CONTENIDO DEL ARCHIVO ORIGEN--------------");
            System.out.println();
            System.out.println("------INICIO DEL CONTENIDO DEL ARCHIVO DESTINO--------------");
            while((linea = bufferedReaderDestino.readLine()) != null){
                System.out.println(linea);
                //contarPalabras = linea.split("\\s+").length;//utilizamos split para separar los strigs por espacios
                //contar lineas
                //contarLineas++;
                //contarPalabras++;
            }
            System.out.println("------FIN DEL CONTENIDO DEL ARCHIVO DESTINO--------------");
            //cerramos los buffers que hayamos creado
            bufferedReaderOrigen.close();
            bufferedReaderDestino.close();
            System.out.println("El fichero ORIGEN contiene "+contarLineas+" lineas");

            System.out.println("El fichero ORIGEN contiene "+contarPalabras+" palabras");


        }catch (IOException e){
            System.out.println("Error al acceder al archivo:"+ fileNameOrigen);
        }
    }
}
