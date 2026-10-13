public class PayPal implements Pagable {
    private String correo;
    private double saldo;

    public PayPal(String correo, double saldo) {
        this.correo = correo;
        this.saldo = saldo;
    }

    @Override
    public boolean pagar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String getMetodo() {
        return "PayPal";
    }
}
