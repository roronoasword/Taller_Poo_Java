public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("rojo", 2);
        c.mostrarColor();
        c.dibujar();
        c.info();
        System.out.println("Area: " + c.area());
    }
}
