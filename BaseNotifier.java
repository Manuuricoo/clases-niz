public class BaseNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("Mensaje base: " + msg);
    }
}