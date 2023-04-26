package openBootcamp.poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * CRUD simula una BBDD y es el acronimo de:
 * Create
 * Retrive/Read
 * Update
 * Delete
 */
public class EmpleadoCRUD {

    //estructura de datos
    static List<Empleado> empleados = new ArrayList<>();//este array debería ser private para que no se pueda acceder a él


        //operaciones CRUD
    //CREATE-almacenar un empleado
    public void save(Empleado empleado) {

        empleados.add(empleado);
    }
        // Ver-Leer-READ empleados
        public static List<Empleado> findAll () {
            return empleados;
        }

}
