import java.util.Date;

public class Factura {
    private int idFactura;
    private Date fecha;
    private Pedido pedido;
    private float total;

    public Factura(int idFactura, Pedido pedido) {
        this.idFactura = idFactura;
        this.fecha = new Date();
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
    }

    public void generarFactura() {
        System.out.println("Factura generada:");
        System.out.println("ID Factura: " + idFactura);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total: " + total);
    }

    public void consultarFactura() {
        System.out.println("Factura ID: " + idFactura + ", Total: " + total);
    }
}
