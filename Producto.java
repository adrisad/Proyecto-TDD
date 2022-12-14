import static org.junit.Assert.fail;

public class Producto{
    private int precio;
    private String nombre;
    private String codigo;
    public Producto(String nombre,int precio,String codigo){
        this.nombre=nombre;
        this.precio=precio;
        this.codigo=codigo;
    }
    public Boolean noEstaVacioElNombre(String name){
        boolean res=true;
        if (name.equals("")) {
            res=false;
            System.out.println("El nombre del producto se encuentra vacio");
        }
        return res;
    }
    
    public boolean verificarCaracteresMaximos(String nombre){
        boolean res=true;
        if (nombre.length()>35) {
            res=false;
            System.out.println("Sobre paso el maximo de caracteres aceptables");
        }
        return res;
    }
    
    public boolean VerificarPrecio(int precio){
        boolean precioCorrecto=true;
        if (precio<=0) {
            precioCorrecto=false;
            System.out.println("Ingrese de precio un numero positivo");
        }
        return precioCorrecto;
    }
    public int getPrecio(){
        return precio;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCodigo(){
        return codigo;
    }
}