public class Main4 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Auto("ABC123", 2020, "Kimi Raikkonen", 4);
        vehiculos[1] = new Moto("XYZ789", 2022, "Mara Sainz", 150);
        vehiculos[2] = new Camion("LMN456", 2018, "Raul Gonzalez", 8000);

        RegistroMunicipal registro = new RegistroMunicipal();

        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
            System.out.println("Impuesto: $" + v.calcularImpuesto());
            System.out.println("-------------");
            registro.agregarVehiculo(v);
        }

        registro.buscarPorAño(2020);

        registro.buscarPorDueño("Mara Sainz");
    }
}
