/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafolistas;

import java.util.Arrays;

/**
 *
 * @author Jesús Sánchez Allende
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        
        Nodo n1 = new Nodo("1");
        Nodo n2 = new Nodo("2");
        Nodo n3 = new Nodo("3");
        Nodo n4 = new Nodo("4");
        
        g.añadirNodo(n1);
        g.añadirNodo(n2);
        g.añadirNodo(n3);
        g.añadirNodo(n4);
        
        Arista a1 = new Arista(n1, n2, 5);
        Arista a2 = new Arista(n3, n1, 4);
        Arista a3 = new Arista(n2, n3, 2);
        Arista a4 = new Arista(n3, n2, 3);
        Arista a5 = new Arista(n4, n4, 4);
        
        g.añadirArista(a1);
        g.añadirArista(a2);
        g.añadirArista(a3);
        g.añadirArista(a4);
        g.añadirArista(a5);

        System.out.println(g.eliminarArista(new Arista(n1, n4, 55)));
//        g.eliminarArista(a5);
        g.eliminarNodo(n4);
        
        System.out.println(Arrays.toString(g.listaNodos()));
        
        System.out.println(Arrays.toString(g.listaAristas()));
    }
    
}
