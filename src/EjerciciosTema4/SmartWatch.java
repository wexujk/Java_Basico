package EjerciciosTema4;

public class SmartWatch extends SmartDevice{

    String tipoCorrea;
    boolean sensorCardiaco;
    String tipoEdicion;
    boolean resistenciaAlAgua;

    public SmartWatch() {
    }

    public SmartWatch(String MAC, String nombreCompania, String sistemaOperativo, int bateriaPorcentaje, String tamañoPantalla, int almacenamiento, String tipoCorrea, boolean sensorCardiaco, String tipoEdicion, boolean resistenciaAlAgua) {
        super(MAC, nombreCompania, sistemaOperativo, bateriaPorcentaje, tamañoPantalla, almacenamiento);
        this.tipoCorrea = tipoCorrea;
        this.sensorCardiaco = sensorCardiaco;
        this.tipoEdicion = tipoEdicion;
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    @Override
    public String toString() {
        return "SmartWatch\n{" +
                "tipoCorrea='" + tipoCorrea + '\'' +
                ", sensorCardiaco=" + sensorCardiaco +
                ", tipoEdicion='" + tipoEdicion + '\'' +
                ", resistenciaAlAgua=" + resistenciaAlAgua +
                ", MAC=" + MAC +
                ", nombreCompania='" + nombreCompania + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", bateriaPorcentaje=" + bateriaPorcentaje +
                ", tamañoPantalla='" + tamañoPantalla + '\'' +
                ", almacenamiento=" + almacenamiento +
                '}';
    }
}
