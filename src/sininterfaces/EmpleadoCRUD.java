package sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retreive/ Read
 * Update
 * Delete
 */
public class EmpleadoCRUD {
    // Estructura de datos
    List<Empleado>empleados = new ArrayList<>();
    // Operaciones CRUD

    //Create --  guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);

    }

    public List<Empleado>findAll(){
        return empleados;
    }
}
