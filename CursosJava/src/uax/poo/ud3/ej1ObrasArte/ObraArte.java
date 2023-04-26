package uax.poo.ud3.ej1ObrasArte;



public class ObraArte {
    //atributos
    protected String nombre;//protected porque quiero que lo herenden las clases hijo
    protected Ciudad ciudad;
    protected int AnyoRealizacion;

    //constructor
    public ObraArte(String nombre, Ciudad ciudad, int anyoRealizacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        AnyoRealizacion = anyoRealizacion;
    }

    //metodos
    /*metodo para ordenar las obras de arte*/
    public int compareTo(Object o){
        //ObraArte oA1= new ObraArte();
        //ObraArte oA2= new ObraArte();
        //oA1.compareTo(oA2);

        if(o instanceof ObraArte){
            ObraArte a = (ObraArte)o;
            if(this.ciudad.compareTo(a.getCiudad()) != 0){//compareTo devuelve 0/-1
                return this.ciudad.compareTo(a.getCiudad());
            }else{
               if(this.getAnyoRealizacion() > a.getAnyoRealizacion()) {
                   return +1;
               }else if(this.getAnyoRealizacion() < a.getAnyoRealizacion()){
                   return -1;
               }else{
                   return this.getNombre().compareTo(a.getNombre());
               }
            }
        }

    }

    @Override
    public String toString() {
        return "ObraArte{" +
                "nombre='" + nombre + '\'' +
                ", ciudad=" + ciudad +
                ", AnyoRealizacion=" + AnyoRealizacion +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getAnyoRealizacion() {
        return AnyoRealizacion;
    }

    public void setAnyoRealizacion(int anyoRealizacion) {
        AnyoRealizacion = anyoRealizacion;
    }
}
