package EjerciciosTema2;

public class Funciones {

    public static void main(String[] args) {
        double precio = 254.46;
        double total = getPrecio(precio);
        System.out.println("El precio total con IVA es: "+total);
    }

    static double getPrecio(double precio){
        return precio * 1.16;
    }
}
