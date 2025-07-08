public class Camion extends Vehiculo {
    private double cargaMaxima;

    public Camion(String patente, int año, String dueño, double cargaMaxima) {
        super(patente, año, dueño);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carga máxima: " + cargaMaxima + " kg");
    }

    @Override
    public double calcularImpuesto() {
        return 5000 + cargaMaxima * 1.5;
    }
}
