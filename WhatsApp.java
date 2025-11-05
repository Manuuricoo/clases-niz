public class WhatsApp implements PlataformaMensajeria {
    @Override
    public void enviar(Mensaje mensaje) {
        System.out.println("Enviando WhatsApp a " + mensaje.getDestinatario() + ": " + mensaje.getContenido());
    }
}