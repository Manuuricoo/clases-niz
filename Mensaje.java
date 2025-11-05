public class Mensaje {
    private String contenido;
    private String destinatario;

    public Mensaje(String contenido, String destinatario) {
        this.contenido = contenido;
        this.destinatario = destinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }
}