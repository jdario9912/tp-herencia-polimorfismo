public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Soy un gato");
    }
}