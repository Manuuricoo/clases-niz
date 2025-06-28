public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula();

        Pelicula pelicula2 = new Pelicula("Inception");

        Pelicula pelicula3 = new Pelicula("Interstellar", "Christopher Nolan", 169);

        pelicula1.mostrarInfo();
        pelicula2.mostrarInfo();
        pelicula3.mostrarInfo();
    }
}