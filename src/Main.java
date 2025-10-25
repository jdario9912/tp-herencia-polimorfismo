import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal a = new Animal();
        animales.add(a);
        Perro perro = new Perro();
        animales.add(perro);
        Gato gato = new Gato();
        animales.add(gato);
        Vaca vaca = new Vaca();
        animales.add(vaca);

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}