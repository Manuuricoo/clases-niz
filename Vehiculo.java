public abstract class Vehiculo {
    private String patente;
    private int año;
    private String dueño;

    public Vehiculo(String patente, int año, String dueño) {
        this.patente = patente;
        this.año = año;
        this.dueño = dueño;
    }

    public String getPatente() {
        return patente;
    }

    public int getAño() {
        return año;
    }

    public String getDueño() {
        return dueño;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Año: " + año);
        System.out.println("Dueño: " + dueño);
    }

    public abstract double calcularImpuesto();
}
