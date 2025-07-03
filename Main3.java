public class Main3 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Cuadrado(4);
        figuras[1] = new Circulo(3);
        figuras[2] = new Triangulo(5, 2);

        for (Figura figura : figuras) {
            System.out.println("Área del " + figura.getNombre() + ": " + figura.area());
        }
    }
}
