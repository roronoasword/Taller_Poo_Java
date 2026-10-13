public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, double salarioBase, String lenguaje) {
        super(nombre, salarioBase);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.10; // 10 % adicional
    }
}
