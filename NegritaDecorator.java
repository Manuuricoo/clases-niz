public class NegritaDecorator implements Formateador {
    private Formateador f;

    public NegritaDecorator(Formateador f) {
        this.f = f;
    }

    public String format(String t) {
        return "<b>" + f.format(t) + "</b>";
    }
}