public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Gerente("Laura", 5000000, 1000000);
        Empleado e2 = new Desarrollador("Carlos", 4000000, "Java");
        e1.mostrarInfo(); // Laura gana $6000000.0
        e2.mostrarInfo(); // Carlos gana $4400000.0
    }
}
