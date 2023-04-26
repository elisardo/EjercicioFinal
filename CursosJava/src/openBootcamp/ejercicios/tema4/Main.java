package openBootcamp.ejercicios.tema4;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice.
 * Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir
 * sus valores por consola.
 */
public class Main {
    public static void main(String[] args) {

        SmartPhone AppleX = new SmartPhone("Apple","X",2020,5500,6.5,true,true);
        System.out.println(AppleX.toString());
        SmartPhone ReadmiNote = new SmartPhone("Xiaomi","ReadmiNote",2021,6500,6.8,false,true);
        System.out.println(ReadmiNote.toString());
        SmartWath AppleWathSE = new SmartWath("Apple","SE",2022,1500,true,3);
        System.out.println(AppleWathSE.toString());
        SmartWath HuaweiWatchGT3 = new SmartWath("Huawei","GT3",2022,1600,true,5);
        System.out.println(HuaweiWatchGT3.toString());
    }


}
