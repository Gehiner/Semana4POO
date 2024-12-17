public class SistemaVentasGUI {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class SistemaVentasGUI extends JFrame {
        private JTextArea areaTexto;
        private JButton btnRegistrarCliente, btnAgregarProducto, btnGenerarFactura;

        // Objetos necesarios para la lógica
        private Pedido pedidoActual;
        private Cliente clienteActual;

        public SistemaVentasGUI() {
            // Configuración de la ventana
            setTitle("Sistema de Ventas de Computadores");
            setSize(500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());

            // Área de texto central para mostrar datos
            areaTexto = new JTextArea();
            areaTexto.setEditable(false);
            add(new JScrollPane(areaTexto), BorderLayout.CENTER);

            // Panel de botones
            JPanel panelBotones = new JPanel();
            panelBotones.setLayout(new GridLayout(3, 1));

            btnRegistrarCliente = new JButton("Registrar Cliente");
            btnAgregarProducto = new JButton("Agregar Producto");
            btnGenerarFactura = new JButton("Generar Factura");

            panelBotones.add(btnRegistrarCliente);
            panelBotones.add(btnAgregarProducto);
            panelBotones.add(btnGenerarFactura);

            add(panelBotones, BorderLayout.SOUTH);

            // Configuración de eventos
            configurarEventos();
        }

        private void configurarEventos() {
            // Evento para registrar un cliente
            btnRegistrarCliente.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    String email = JOptionPane.showInputDialog("Ingrese el email del cliente:");
                    String direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
                    String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");

                    // Crear cliente
                    clienteActual = new Cliente(1, nombre, email, direccion, telefono, "2024-12-02");
                    pedidoActual = new Pedido(1, clienteActual);

                    areaTexto.append("Cliente registrado: " + nombre + " (" + email + ")\n");
                }
            });

            // Evento para agregar un producto
            btnAgregarProducto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (clienteActual == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar un cliente.");
                        return;
                    }
                    String nombre = JOptionPane.showInputDialog("Nombre del producto:");
                    String modelo = JOptionPane.showInputDialog("Modelo:");
                    String precioStr = JOptionPane.showInputDialog("Precio del producto:");
                    float precio = Float.parseFloat(precioStr);
                    String descripcion = JOptionPane.showInputDialog("Descripción:");

                    Computador producto = new Computador(101, nombre, modelo, descripcion, precio, 10, "General");
                    pedidoActual.agregarProducto(producto);

                    areaTexto.append("Producto agregado: " + nombre + " - $" + precio + "\n");
                }
            });

            // Evento para generar factura
            btnGenerarFactura.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (pedidoActual == null) {
                        JOptionPane.showMessageDialog(null, "No hay pedido para facturar.");
                        return;
                    }
                    Factura factura = new Factura(1, pedidoActual);
                    areaTexto.append("\n--- Factura Generada ---\n");
                    factura.generarFactura();
                }
            });
        }
    }

}
