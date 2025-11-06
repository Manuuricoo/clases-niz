public class CursivaDecorator implements Formateador {
    private Formateador f;

    public CursivaDecorator(Formateador f) {
        this.f = f;
    }

    public String format(String t) {
        return "<i>" + f.format(t) + "</i>";
    }
}