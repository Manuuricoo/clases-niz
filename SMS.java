public class SMS implements PlataformaMensajeria {
    @Override
    public void enviar(Mensaje mensaje) {
        System.out.println("Enviando SMS a " + mensaje.getDestinatario() + ": " + mensaje.getContenido());
    }
}