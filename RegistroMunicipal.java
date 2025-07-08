import java.util.ArrayList;
import java.util.List;

public class RegistroMunicipal {
    private List<Vehiculo> vehiculos;

    public RegistroMunicipal() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void buscarPorAño(int año) {
        System.out.println("Vehículos del año " + año + ":");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == año) {
                v.mostrarDatos();
                System.out.println("-------------");
            }
        }
    }

    public void buscarPorDueño(String dueño) {
        System.out.println("Vehículos del dueño " + dueño + ":");
        for (Vehiculo v : vehiculos) {
            if (v.getDueño().equalsIgnoreCase(dueño)) {
                v.mostrarDatos();
                System.out.println("-------------");
            }
        }
    }
}