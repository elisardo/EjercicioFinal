/* Prueba 1
 Objetivo de la prueba:
Realizar la operación de limpieza en un grafo sin nodos.
 Preámbulo
Crear un grafo vacío.
 Cuerpo
Datos de entrada: Un grafo vacío. El valor es indiferente pues no hay aristas en el grafo: valor = 10.
 Postámbulo
Ninguno.
 Resultado esperado
Un grafo vacío. Para comprobarlo el número de nodos del nuevo grafo debe ser de cero.
Prueba 2
 Objetivo de la prueba
Realizar la operación de limpieza en un grafo sin aristas.
 Preámbulo
Crear el grafo y añadirle varios nodos, por ejemplo tres.
 Cuerpo
Datos de entrada: Un grafo con los nodos “A”, “B” y “C”. El valor es indiferente pues no hay aristas en el grafo: valor = 10.
 Postámbulo
Ninguno.
 Resultado esperado
Un grafo vacío. Para comprobarlo el número de nodos del nuevo grafo debe ser de cero.
Prueba 3
 Objetivo de la prueba
Realizar la operación de limpieza en un grafo con todas las aristas cuyo peso sea menor que valor.
 Preámbulo
Crear el grafo y añadirle varios nodos por ejemplo cuatro y dos aristas de valores 5 y 7.
 Cuerpo
Datos de entrada: Un grafo con los nodos “A”, “B”, “C” y “D”. y dos Aristas: (“A”, “B”, 5) y (“C”, “D”, 7); valor = 10.
 Postámbulo
Ninguno.
 Resultado esperado
Un grafo vacío. Para comprobarlo el número de nodos del nuevo grafo debe ser de cero.
Prueba 4
 Objetivo de la prueba
Realizar la operación de limpieza en un grafo con una sola arista cuyo peso sea mayor o igual que valor.
 Preámbulo
Crear el grafo y añadirle varios nodos por ejemplo cuatro y una aristas de valor 10.
 Cuerpo
Datos de entrada: Un grafo con los nodos “A”, “B”, “C” y “D”; y una Aristas: (“A”, “B”, 10); valor = 10.
 Postámbulo
Ninguno.
 Resultado esperado
Un grafo con dos nodos y una arista. Los nodos han de ser “A” y “B”; la arista ha de ser (“A”, “B”, 10).
*/


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrafoTest {
    //Declaración de variables
    Grafo grafo;
    Nodo nodo1;
    Nodo nodo2;
    Nodo nodo3;

    Arista arista1;
    Arista arista2;

    static Grafo instance;



    @Before
    public void setUp() throws Exception {
        grafo = new Grafo();
        nodo1 = new Nodo("A");
        nodo2 = new Nodo("B");
        nodo3 = new Nodo("C");
        arista1 = new Arista(nodo2, nodo3, 5);
        arista2 = new Arista(nodo3, nodo3, 3);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void prueba1() {
//crear grafo vacio con valor 10
        grafo.limpieza();
        int valor = 10;
        int expResult = 0;
        int result = grafo(0);


    }

    private int grafo(int i) {
        return 0;
    }

    public void prueba2() {
//todas las arista tienen nodo origen

    }

    public void prueba3() {
//
    }
}