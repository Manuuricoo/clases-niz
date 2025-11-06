public class MainFormateador {
    public static void main(String[] args) {
        Formateador f = new SubrayarDecorator(new CursivaDecorator(new NegritaDecorator(new PlainFormateador())));
        System.out.println(f.format("Hola mundo"));
    }
}