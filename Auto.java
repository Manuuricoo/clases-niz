public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String patente, int año, String dueño, int cantidadPuertas) {
        super(patente, año, dueño);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    @Override
    public double calcularImpuesto() {
        return 3000 + (2025 - getAño()) * 100;
    }
}