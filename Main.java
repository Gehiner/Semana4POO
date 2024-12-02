public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Juan Pérez", "juan.perez@example.com", "Calle 123", "555-1234", "2024-12-02");
        cliente.registrarCliente();

        Computador pc1 = new Computador(101, "PC Gamer", "G123", "Alta performance", 1500.0f, 10, "Gamer");
        Computador pc2 = new Computador(102, "Laptop Pro", "L456", "Ligera y potente", 1200.0f, 5, "Portátil");

        Pedido pedido = new Pedido(1, cliente);
        pedido.agregarProducto(pc1);
        pedido.agregarProducto(pc2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        pedido.actualizarEstado("Confirmado");

        Factura factura = new Factura(1, pedido);
        factura.generarFactura();
    }
}
