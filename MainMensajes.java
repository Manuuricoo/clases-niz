import java.util.Arrays;

public class MainMensajes {
    public static void main(String[] args) {

        GestorMensajes gestor = new GestorMensajes();

        gestor.agregarPlataforma(new WhatsApp());
        gestor.agregarPlataforma(new Mail());
        gestor.agregarPlataforma(new SMS());

        Mensaje mensaje = new Mensaje("Hola ¿Como estas?", "Franco");

        gestor.enviar(mensaje);

        System.out.println("\n--- Cambiando el orden de envío ---\n");

        gestor.setOrden(Arrays.asList(new SMS(), new Mail(), new WhatsApp()));
        gestor.enviar(mensaje);
    }
}