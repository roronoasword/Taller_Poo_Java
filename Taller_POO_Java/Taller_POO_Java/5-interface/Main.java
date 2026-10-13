public class Main {
    public static void main(String[] args) {
        Pagable[] metodos = {
            new TarjetaCredito("1234-5678", 500000),
            new PayPal("ana@correo.com", 200000)
        };
        for (Pagable p : metodos) {
            System.out.println(p.getMetodo() + ": " + p.pagar(300000));
        }
        // Tarjeta de credito: true
        // PayPal: false
    }
}
