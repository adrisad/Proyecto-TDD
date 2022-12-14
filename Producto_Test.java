import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Producto_Test {
    public Producto producto;
    @Test
    public void SiNombreEstaVacioRetornarFalse(){
        producto=new Producto("", 123, "Peces-123");
        String cadena= producto.getNombre();
        boolean respuesta=producto.noEstaVacioElNombre(cadena);
        assertEquals(false, respuesta);
    }
    @Test
    public void SiNombreTieneMasDe35CaracteresDevolverFalse(){
        producto=new Producto("motor x200 marca boyu de una entrada y una salida", 123, "Peces-123");
        String cadena= producto.getNombre();
        boolean respuesta=producto.verificarCaracteresMaximos(cadena);
        assertEquals(false, respuesta);
    }
    @Test
    public void SiPrecioEsUnNUmeroMenorIgualACeroDevolvemosFalse(){
        producto=new Producto("motor x200 ", 0, "Peces-123");
        int precio= producto.getPrecio();
        boolean respuesta=producto.VerificarPrecio(precio);
        assertEquals(false, respuesta);
    }

}
