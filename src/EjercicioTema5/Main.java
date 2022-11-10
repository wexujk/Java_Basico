package EjercicioTema5;

public class Main {
    public static void main(String[] args) {

            CocheCRUD cocheCrud = new CocheCRUDImpl();

            cocheCrud.save(new Coche());
            cocheCrud.findAll();
            cocheCrud.delete(new Coche());
            
    }
}
