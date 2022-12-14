public class Main {
    public static void main(String[] args) {
        Producto producto1=new Producto("Motor boyu", 123, "Motor-1234");
        Producto producto2=new Producto("Motor boyu x2", 1233, "Motor-1225");
        Archivo registro=new Archivo();
        registro.RegistrarProducto(producto1, "Registro");
        registro.RegistrarProducto(producto2, "Registro");
        BuscarProducto buscador=new BuscarProducto();
        buscador.Buscar("Motor-1225","Registro");
        //registro.CrearRegistro("Registro");
        
    }
}
