public class Computador {
    private int idProducto;
    private String nombre;
    private String modelo;
    private String descripcion;
    private float precio;
    private int stock;
    private String categoria;

    public Computador(int idProducto, String nombre, String modelo, String descripcion, float precio, int stock, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public void consultarProducto() {
        System.out.println("Producto: " + nombre + ", Modelo: " + modelo + ", Precio: " + precio);
    }

    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        System.out.println("Stock actualizado para " + nombre + ". Stock actual: " + stock);
    }

    public boolean verificarStock(int cantidad) {
        return this.stock >= cantidad;
    }
}
