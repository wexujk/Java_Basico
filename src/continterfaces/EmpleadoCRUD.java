package continterfaces;
import sininterfaces.Empleado;
import java.util.List;

/**
 * se deckaran los metodos no se implementan
 * Actúa como un contrato de o que hay que hacer pero no lo hace
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);
    List<Empleado> findAll();
    void delete(Empleado empleado);

}
