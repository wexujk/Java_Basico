package EjercicioTema5;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(Coche coche) {
        System.out.println("Save coche");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Find all");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Delete coche");
    }
}
