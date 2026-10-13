public class Informe {
    private String contenido;

    public Informe(String contenido) {
        this.contenido = contenido;
    }

    // Dependencia: Impresora llega por parametro, no se guarda como atributo
    public void exportar(Impresora impresora) {
        impresora.imprimir(contenido);
    }
}
