public class CeldaHash<E,k> {
    private E dato; // dato de la celda
    private k clave; // clave de la celda
    private boolean borrado; // indica si la celda esta borrada

    public CeldaHash(E dato, k clave) {
        this.dato = dato;
        this.clave = clave;
    }
    public E getDato() { return dato; }

    public k getClave() { return clave;}

    public void setBorrado(boolean borrado) { this.borrado = borrado; }
    public k getBorrado() { return borrado; }
}
