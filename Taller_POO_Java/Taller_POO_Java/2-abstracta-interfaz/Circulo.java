// Extiende UNA clase abstracta e implementa VARIAS interfaces
public class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo " + color);
    }
}
