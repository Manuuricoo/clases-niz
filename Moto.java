public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String patente, int año, String dueño, int cilindrada) {
        super(patente, año, dueño);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }

    @Override
    public double calcularImpuesto() {
        return 1500 + cilindrada * 0.2;
    }
}