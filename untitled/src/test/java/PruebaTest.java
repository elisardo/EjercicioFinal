import org.junit.*;

import java.sql.SQLOutput;

import static org.junit.Assert.*;
/** Casos de prueba
 Prueba 1:
 ◼ Objetivo: Comprobar que dado un array de 100 valores enteros diferentes
 y un valor que es el último del array, encuentra la posición en que se
 encuentra.
 ◼ Preámbulo: Construir un array de 100 enteros y rellenarlo.
 ◼ Cuerpo: Los valores para la prueba serán: el array se rellena con los
 números del 101 al 200. El valor a buscar será el 200.
 ◼ Postámbulo: Ninguno.
 ◼ Resultado esperado: Debe devolver que se ha encontrado en la posición
 99 (última posición del array).
 Prueba 2:
 ◼ Objetivo: Comprobar que dado un array de 100 valores enteros diferentes
 y un valor que no está en el array, no se encuentra el valor.
 ◼ Preámbulo: Construir un array de 100 entero y rellenarlo.
 ◼ Cuerpo: Los datos serán: rellenar el array con los valores del 0 al 99.
 Se buscará el valor 100.
 ◼ Postámbulo: Ninguno
 ◼ Resultado esperado: El método debe devolver -1 (no se encuentra).
 Prueba 3:
 ◼ Objetivo: Comprobar que dado un array de tamaño 0 no se encuentra
 el valor.
 ◼ Preámbulo: Construir un array de tamaño 0.
 ◼ Cuerpo: Los datos serán: un array de tamaño 0 y cualquier valor, por
 ejemplo el 32.
 ◼ Postámbulo: Ninguno
 ◼ Resultado esperado: El método debe devolver -1 (no se encuentra).
 Prueba 4:
 ◼ Objetivo: Comprobar que dado un array nulo no se encuentra el valor.
 ◼ Preámbulo: Construir un array de tamaño 0.
 ◼ Cuerpo: Los datos serán: un array de valor null y cualquier valor, por
 ejemplo el 32.
 ◼ Postámbulo: Ninguno
 ◼ Resultado esperado: El método debe devolver -1 (no se encuentra).
 * **/

//casos de prueba
prueba 1:
objetivo

public class PruebaTest {
   //Declaramos unos arrays de enteros para pruebas
    static int[] array1;
    static int[] array2;
    static int[] array3;
    static Prueba instance;


    //se ejecuta una sola vez antes de todos los test
    @BeforeClass
    public static void setUpClass() {
        array1 = new int[100];
        array2 = new int[100];
        array3 = new int[0];
        instance = new Prueba();
    }
    //se ejecuta una sola vez despues de todos los test
    @AfterClass
    public static void tearDownClass() {}//tearDownClass nos permite hacer una accion despues de todos los test

    @Before
    public void setUp() throws Exception {//setup es para inicializar variables antes de cada test
        for (int i = 0; i < array1.length; i++) {//rellenamos el array1 con numeros para siempre las mismas pruebas
            array1[i] = 101+i; //el array1 empieza en 101 y termina en 200
        }
        for (int i = 0; i < array2.length; i++) {//rellenamos el array2 con numeros para siempre las mismas pruebas
            array2[i] = i;//posicion en la que esta el valor
        }
    }

    @After
    public void tearDown() throws Exception {//tearDown nos permite limpiar los datos que se hayan creado en el test
    }

    @Test
    public void testbuscar1() {
        int[] array = array1;//buscar en este array1 el valor....
        int valor = 200;//valor a buscar en array1
        int expResult =99;//valor 99 esperado estará en la posicion 200 del array1
 /* Podemos generar un error entre valor obtenido y generado si cambiamos el 99 por 98*/
        int result = instance.buscar(array, valor);

        assertEquals(expResult, result);

        //fail("Test de prueba");
    }

    @Test
    public void testbuscar2() {
        int[] array = array2;//comienza en 0 y termina en 99
/*Si ponemos un valor 99 que si está en el array nos tendría que dar un error porque esperamos -1 */
        int valor = 100;//valor 100 no deberia estar en array2
        int expResult =-1;//por tanto, esperamos un -1
        int result = instance.buscar(array, valor);

        assertEquals(expResult, result);

        //fail("Test de prueba");
    }
    @Test
    public void testbuscar3() {
        int[] array = array3;//comienza en 0 y termina en 99
        /*Si ponemos un valor 99 que si está en el array nos tendría que dar un error porque esperamos -1 */
        int valor = 32;//el array3 esta vacio, por tanto no deberia encontrar el valor
        int expResult =-1;//por tanto, esperamos un -1
        int result = instance.buscar(array, valor);

        assertEquals(expResult, result);

        //fail("Test de prueba");
    }
    @Test
    public void testbuscar4() {
        int[] array = array3;//comienza en 0 y termina en 99
        /*Si ponemos un valor 99 que si está en el array nos tendría que dar un error porque esperamos -1 */
       // int valor = null;//¿que pasa si buscamos un valor nulo?
        int valor =32;
        int expResult =-1;//por tanto, esperamos un -1
        int result = instance.buscar(array, valor);

        assertEquals(expResult, result);
    }

    /* Otros metodos de comparcion son*/
    @Test
    public void testEstaVacio1() {
        int []array = array1;// array1 no esta vacio, por tanto dara false y pasara el test
        assertFalse(instance.estaVacio(array));
    }
    @Test
    public void testEstaVacio2() {
        int []array = array2;// array2 no esta vacio, por tanto dara false y pasara el test
        assertFalse(instance.estaVacio(array));
    }
    @Test
    public void testEstaVacio3() {
        int []array = array3;// array3 tiene 0 elementos, por tanto dara TRUE y NO pasara el test
        assertFalse(instance.estaVacio(array));
    }
    @Test
    public void testEstaVacio4() {
        int []array = null;// el asserrFalse ahora esta con la negacion de la condicion
        assertFalse(!instance.estaVacio(array));
    }
    //mas metodos son:
    //assertTrue(boolean) //si el boolean es true, pasara el test
    //asserNotNull(object) //si el object no es null, pasara el test
    //assertNull(object) //si el object es null, pasara el test
    //assertNoEquals(object1, object2) //si los object1 y object2 no son iguales, pasara el test
    //fail("Test de prueba"); //si se pasa por esta sentencia el test fallara
    //failSame(????); //si se pasa por esta sentencia y el objeto es el mimo, el test fallara


}