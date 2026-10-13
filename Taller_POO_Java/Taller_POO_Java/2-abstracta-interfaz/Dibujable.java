public interface Dibujable {
    void dibujar(); // public abstract implicito

    default void info() {
        System.out.println("Soy dibujable");
    }
}
