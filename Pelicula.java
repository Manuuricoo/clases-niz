public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
        this.titulo = "Desconocido";
        this.director = "Desconocido";
        this.duracion = 0;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
        this.director = "Desconocido";
        this.duracion = 0;
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos\n");
    }
}