public class Cliente {
    private int idCliente;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaRegistro;

    public Cliente(int idCliente, String nombre, String email, String direccion, String telefono, String fechaRegistro) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }

    public void registrarCliente() {
        System.out.println("Cliente registrado: " + nombre);
    }

    public void actualizarDatos(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        System.out.println("Datos actualizados para el cliente: " + nombre);
    }

    public String consultarCliente() {
        return "Cliente: " + nombre + ", Email: " + email + ", Dirección: " + direccion;
    }
}
