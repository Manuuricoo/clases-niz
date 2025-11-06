public class MainDecorator {
    public static void main(String[] args) {
        Notifier n = new WhatsAppNotifier(new EmailNotifier(new BaseNotifier()));
        n.send("Hola");
    }
}