import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        Circulo c1 = new Circulo("Circulo 1", 4);
        Circulo c2 = new Circulo("Circulo 2", 5);
        Rectangulo r1 = new Rectangulo("Rectangulo 1", 3, 6);
        Rectangulo r2 = new Rectangulo("Rectangulo 2", 3, 5);
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);

        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }
}