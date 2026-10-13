public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double area(); // sin cuerpo: la hija lo implementa

    public void mostrarColor() {
        System.out.println(color);
    }
}
