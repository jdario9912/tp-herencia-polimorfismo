public class Rectangulo extends Figura{
    private double alto;
    private double ancho;

    public Rectangulo(String nombre,  double alto, double ancho) {
        super(nombre);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando area del" + getNombre() + ": " + (this.alto * 2 + this.ancho * 2));
    }
}