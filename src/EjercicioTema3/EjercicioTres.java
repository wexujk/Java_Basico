package EjercicioTema3;

public class EjercicioTres {
    public static void main(String[] args) {


        String[] nombres= {"Maria", "come", "cuando", "sola","piensa"};
        String texto= "";
        for(String nombre : nombres){
            texto +=nombre+ " ";
        }
        System.out.println(texto);

    }
}
