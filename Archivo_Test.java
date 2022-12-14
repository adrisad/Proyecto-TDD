import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class Archivo_Test {
    public Producto producto;
    @Test
    public void SiProductoEsValidoDevolvertrue(){
        Archivo archivo=new Archivo();
        producto=new Producto("motor x200 ", 123, "Peces-123");
        boolean respuesta=archivo.esUnProductoValido(producto);
        assertEquals(true, respuesta);
    }
    @Test
    public void SiNoSePuedeCrearArchivoLanzarExcepcion(){
        Archivo archivo=new Archivo();
        try {
            archivo.CrearRegistro("Inventario");
            
        } catch (Exception e) {
            
        }
        
    }
    @Test
    public void agregarARegistroProductoValido(){
        Archivo archivo=new Archivo();
        Producto producto=new Producto("motor x200 ", 123, "Peces-123");
        archivo.RegistrarProducto(producto, "Inventario");


        
        
    }
}
