public class Circulo extends Figura {
    private double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando area del " + getNombre() + " con radio: " + this.radio + ": " + (Math.PI * this.radio * this.radio));
    }
}