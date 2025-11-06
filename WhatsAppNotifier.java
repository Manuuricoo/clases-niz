public class WhatsAppNotifier extends NotifierDecorator {
    public WhatsAppNotifier(Notifier w) {
        super(w);
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("Enviado por WHATSAPP: " + msg);
    }
}