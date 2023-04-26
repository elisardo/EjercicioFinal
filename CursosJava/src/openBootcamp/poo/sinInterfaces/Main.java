package openBootcamp.poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito =new Empleado("Juanito",30,40000,true);
        Empleado patricia =new Empleado("Patricia",30,40000,true);
        Empleado roberto =new Empleado("Roberto",30,40000,true);

        //guardar empleados
        empleadoCRUD.save(juanito);//inserta el objeto juanito en el arryList
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);

        //consultar empleados
        List<Empleado> empleados= EmpleadoCRUD.findAll();// guardamos la busqueda en un ArrayList empleados
        System.out.println(empleados);//para imprimir todo la List. Imprimirá la lista en memoria si no hay toString

    }
}
