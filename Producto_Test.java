import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Producto_Test {
    public ExpectedException exception= ExpectedException.none();
    private Producto producto;
    @Before
    public void setap(){
        exception.expect(RuntimeException.class);
        producto=new Producto();
    }

    @Test
    public void SiElNombreEstaVacioReportar() throws Exception{
        try {
            producto.VerificarNombreNoVacio("");
            fail("Ingrese el nombre porfavor");
        } catch (Exception e) {
            
        }
    }

    @Test
    public void siElNombreEsMayor_a_35CaracteresLazarExcepcion(){
        try {
            producto.verificarCaracteresMaximos("Motor electrico para pecera marca boyu");
            fail("Sobre paso el maximo de caracteres aceptables");
        } catch (Exception e) {
            
        }
    }

    @Test
    public void siElPrecioEsMenorIgual_a_ceroReportar(){
        try {
            producto.VerificarPrecio(0);
            fail("Ingrese de precio un numero positivo");
        } catch (Throwable e) {
            
        }
    }
}
