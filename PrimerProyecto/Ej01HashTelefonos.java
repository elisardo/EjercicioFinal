//Para cierto problema se va a utilizar una tabla hash para guardar
// los datos tomando como clave los números de teléfono de las personas,
// cuya definición se realizó de la siguiente forma:
//  class Persona{
//      String telefono;
//      // resto de los atributos y métodos
//          ...
//    }
// Suponga que los números de teléfono que se desean insertar en una tabla de tamaño 7
// son los siguientes: 8456, 8578, 8523, 8512, 8518. La función hash hace la suma
// de los dígitos de los números de teléfono. Indique como quedaría en la misma
// si se hace dispersión cuadrática
//a) Para una tabla hash cerrada.
//b) Para una tabla hash abierta.
//c) Escriba una función de hash que haga la suma de los valores dígitos del
// número telefónico que se le pasa, tal como se ha utilizado en el apartado anterior.

public class Ej01HashTelefonos {
    public int fHash(String telefono){
        int suma = 0;
        for (int i = 0; i < telefono.length(); i++) {
        suma += telefono.charAt(i) - '0'; // - '0' para que los caracteres sean enteros
    }
        int tamañoTabla=7;
        return suma % tamañoTabla;
    }
}
