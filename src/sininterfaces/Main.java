package sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD =  new EmpleadoCRUD();
        Empleado juanito = new Empleado("juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);
        // Guardar empleados
        empleadoCRUD.guardar(juanito);
        System.out.println(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(roberto);

        // consutar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}

