public class Alumno {

    private String nombre;
    private int edad;
    private double promedio;

    public Alumno(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarPromedio() {
        System.out.println("El promedio de " + nombre + " es: " + promedio);
    }

    public void aumentarPromedio(int valor) {
        this.promedio += valor;

        if (this.promedio > 10) {
            this.promedio = 10;
        }
    }
}
