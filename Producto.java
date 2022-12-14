public class Producto{
    private String precio;
    private String nombre;
    private String codigo;
    //private int unidades;

    public Producto(String nombre,String precio,String codigo){
        this.nombre=nombre;
        this.precio=precio;
        this.codigo=codigo;
        //unidades=1;
    }
    public void VerificarNombreNoVacio(String nombre)throws Exception{
        if (nombre.equals("")) {
            throw 
            new Exception("Ingrese el nombre porfavor");
        }
    }
    public void VerificarPrecio(int precio)throws Throwable{
        if (precio<=0) {
            throw new RuntimeException("Ingrese de precio un numero positivo");
        }
    }
    public void verificarCaracteresMaximos(String nombre)throws Exception{
        if (nombre.length()>35) {
            throw new RuntimeException("Sobre paso el maximo de caracteres aceptables");
        }
    }
    public String getPrecio(){
        return precio;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCodigo(){
        return codigo;
    }
}