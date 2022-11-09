package EjerciciosTema4;

public class SmartPhone extends SmartDevice{
    String pixelescamara;
    long numeroTelefono;
    int numeroCamaras;

    public SmartPhone() {
    }

    public SmartPhone(String MAC, String nombreCompania, String sistemaOperativo, int bateriaPorcentaje, String tamañoPantalla, int almacenamiento, String pixelescamara, long numeroTelefono, int numeroCamaras) {
        super(MAC, nombreCompania, sistemaOperativo, bateriaPorcentaje, tamañoPantalla, almacenamiento);
        this.pixelescamara = pixelescamara;
        this.numeroTelefono = numeroTelefono;
        this.numeroCamaras = numeroCamaras;
    }

    @Override
    public String toString() {
        return "SmartPhone\n{" +
                "pixelescamara='" + pixelescamara + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", numeroCamaras=" + numeroCamaras +
                ", MAC=" + MAC +
                ", nombreCompania='" + nombreCompania + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateriaPorcentaje=" + bateriaPorcentaje +
                ", tamañoPantalla='" + tamañoPantalla + '\'' +
                ", almacenamiento=" + almacenamiento +
                '}';
    }
}
