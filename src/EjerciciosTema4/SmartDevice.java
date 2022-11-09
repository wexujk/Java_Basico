package EjerciciosTema4;

abstract class SmartDevice {
    String MAC;
    String nombreCompania;
    String sistemaOperativo;
    int bateriaPorcentaje;
    String tamañoPantalla;
    int almacenamiento;

    public SmartDevice() {
    }

    public SmartDevice( String MAC, String nombreCompania, String sistemaOperativo, int bateriaPorcentaje, String tamañoPantalla, int almacenamiento) {
        this.MAC = MAC;
        this.nombreCompania = nombreCompania;
        this.sistemaOperativo = sistemaOperativo;
        this.bateriaPorcentaje = bateriaPorcentaje;
        this.tamañoPantalla = tamañoPantalla;
        this.almacenamiento = almacenamiento;
    }


}
