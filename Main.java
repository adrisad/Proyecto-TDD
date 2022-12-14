public class Main {
    public static void main(String[] args) {
        Producto producto=new Producto("Motor boyu", "123", "Motor-1234");
        Archivo registro=new Archivo();
        registro.CrearRegistro("Registro");
        registro.RegistrarProducto(producto, "Registro");
    }
}
