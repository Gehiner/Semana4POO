import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Date fecha;
    private String estado;
    private Cliente cliente;
    private List<Computador> productos;

    public Pedido(int idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = new Date();
        this.estado = "Pendiente";
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Computador producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(Computador producto) {
        productos.remove(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());
    }

    public float calcularTotal() {
        float total = 0;
        for (Computador producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void actualizarEstado(String estado) {
        this.estado = estado;
        System.out.println("Estado del pedido actualizado a: " + estado);
    }
}
