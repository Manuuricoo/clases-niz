public class Mail implements PlataformaMensajeria {
    @Override
    public void enviar(Mensaje mensaje) {
        System.out.println("Enviando MAIL a " + mensaje.getDestinatario() + ": " + mensaje.getContenido());
    }
}