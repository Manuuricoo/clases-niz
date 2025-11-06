public class SubrayarDecorator implements Formateador {
    private Formateador f;

    public SubrayarDecorator(Formateador f) {
        this.f = f;
    }

    public String format(String t) {
        return "<u>" + f.format(t) + "</u>";
    }
}