public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Soy un perro");
    }
}