public class TarjetaCredito implements Pagable {
    private String numero;
    private double limite;

    public TarjetaCredito(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    @Override
    public boolean pagar(double monto) {
        if (monto <= limite) {
            limite -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String getMetodo() {
        return "Tarjeta de credito";
    }
}
