package Ejercicio2;
/* Suponga que los números de DNI que se desean insertar en una tabla Hash abierta de tamaño 7 son los siguientes:
1455, 1502, 1524, 1512, 1511. La función hash hace la suma de los dígitos de los números de DNI*/

import java.util.Arrays;

public class HashFunction {
    String[] theArray;
    int arraySize;
    int itemsInArray=0;

    public static void main(String[] args) {
        HashFunction theFunc = new HashFunction(30);
        String[] elementsToAdd = { "1","5","17","21","26"};
        theFunc.hashFunction1(elementsToAdd,theFunc.theArray);
        theFunc.displayTheStack();
    }

    public void hashFunction1(String[] stringsForArray, String[] theArray){
        for(int n=0; n < stringsForArray.length; n++){
            String newElementVal =stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)]= newElementVal;
        }
    }
    HashFunction(int size){
        arraySize=size;
        theArray=new String[size];
        Arrays.fill(theArray,"-1");
    }

    public void displayTheStack(){
        int increment =0;
    }


}
