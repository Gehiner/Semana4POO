import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Ejecución de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SistemaVentasGUI().setVisible(true);
            }
        });
    }
}
