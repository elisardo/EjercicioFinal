package Ejercicio3;

public class GrafoExtraer(int tipo1, int tipo2) {

    private Object tipo1;
    private Object tipo2;
    private Object grafo1;
    private Object grafo2;

    //hacer un grafo1 con nodos, aristas y tipos de carreteras tipo1 y tipo2
    grafo1 = new Grafo(tipo1, tipo2);
    //copiar completamente el grafo1 original con nodos, aristas y tipos de carreteras en un nuevo grafo2
    grafo2 = new Grafo(tipo1, tipo2) {
        for (int i = 0; i < grafo1.getNodos().size(); i++) {
            grafo2.addNodo(grafo1.getNodos().get(i));
        }
        for (int i = 0; i < grafo1.getAristas().size(); i++) {
            grafo2.addArista(grafo1.getAristas().get(i));
        }
        for (int i = 0; i < grafo1.getTipos().size(); i++) {
            grafo2.addTipo(grafo1.getTipos().get(i));
        }
    }


    //eliminamos del nuevo grafo2 las aristas que no son de tipo1 o tipo2
    for (int i = 0; i < grafo2.getAristas().size(); i++) {//
        if (!(grafo2.getAristas().get(i).getTipo().equals(tipo1) || grafo2.getAristas().get(i).getTipo().equals(tipo2))) {
            grafo2.removeArista(grafo2.getAristas().get(i));
        }
    }
    //se devuelve el nuevo grafo2
    return grafo2;








}
  