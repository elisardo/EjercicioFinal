/*

public class TablaHash <E,k> {
    private CeldaHash <E, k>[] tabla;

    private int TAM=23;
    private int numElementos;
    private final int FACTOR_CARGA=50
    public TablaHash(TAM){
        tabla = new CeldaHash[TAM]; // crea una tabla de tamaño TAM
    }
    public TablaHash(int tamaño){
        tabla = new CeldaHash[(tamaño<11)?11]; // crea una tabla del tamaño del constructor y si el valor menor a 11, la tabla sera de tamaño 11
    }
    public boolean insertar(E dato, k clave){
        if(dato==null || clave==null) {
            return false;//verificar
        }
        if ((numElementos+1)*100/ tabla.length > FACTOR_CARGA){
            rehash();
        }

        int hash = fHash(clave);
        int pos=hash;
        int colision=0;

        while(tabla[pos]!=null {
              if tabla[pos].getClave().equals(clave) {
                  return false;//no inserto porque ya esta
              }
              colision++;
              //resolucion lineal
                pos=(hash+colision) % tabla.length;

              //resolucion cuadratica
                pos=(hash+colision*colision) % tabla.length;
              //resolucion doble dispersion
              //  pos=(hash+colision*Fhash2(clave)) % tabla.length;//K-(x % K)
        }

        tabla[pos] = new CeldaHash<E,k>(dato, clave);
        numElementos++;
        return true;

    }

    public E buscar(k clave){
        if(clave==null) { return null; }//verificar

        int hash = fHash(clave);
        int pos=hash;
        int colision=0;
        while (tabla[pos]!=null) {
            if (tabla[pos].isBorrado() && tabla[pos].getClave().equals(clave)){
                return tabla[pos].getDato();
            }
            colision++;
            pos=(hash+colision+colision) % tabla.length;
        }
    }

    public boolean borrar(k clave){
        if (clave==null) { return false; }

        int hash = fHash(clave);
        int pos=hash;
        int colision=0;
        while (tabla[pos]!=null) {
            if (tabla[pos].isBorrado() && tabla[pos].getClave().equals(clave)){
                tabla[pos].setBorrado(true);
                return true;
            }
            colision++;
            pos=(hash+colision+colision) % tabla.length;
        }
        return false;}

    private void rehash(){
        CeldaHash<E,k>[] tablaAntigua = tabla;
        tabla = new CeldaHash[tabla.length*2+1];
        numElementos=0;

        for (CeldaHash<E,k> celda : tablaAntigua) {
            if (celda!=null && !celda.isBorrado()) {
                insertar(celda.getDato(), celda.getClave());
            }
        }
        

    }
    private int fHash(int clave){
        return clave % tabla.length;// devuelve el indice de la celda MOD TAM
    }
}
*/