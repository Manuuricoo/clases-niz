public class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier w) {
        super(w);
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("Enviado por EMAIL: " + msg);
    }
}