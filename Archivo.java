import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Archivo {
    public boolean CrearRegistro(String NombreArchivo){
        boolean res=true;
        try {
            File fichero = new File ("C:\\Users\\adran\\Documents\\ProyectoTDD",NombreArchivo);
            if (!fichero.createNewFile()){
                res=false;
            }
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return res;
    }
    public void RegistrarProducto(Producto producto,String NombreArchivo){
        if (esUnProductoValido(producto)) {
            BufferedWriter escribir= null;
            try{
                escribir=new BufferedWriter(new FileWriter(NombreArchivo,true));
                escribir.write(producto.getNombre());
                escribir.write("||");
                escribir.write(producto.getCodigo());
                escribir.write("||");
                escribir.write(producto.getPrecio()+"");
                escribir.newLine();
                escribir.close();
                
                fail("No se pudo registrar el producto");
            } catch (Throwable e) {
                
            }finally{
                try {
                    escribir.close();
                } catch (Exception e) {
                    
                }
            }
        }
    }
    public boolean esUnProductoValido(Producto producto){
        return producto.noEstaVacioElNombre(producto.getNombre()) &&
                producto.verificarCaracteresMaximos(producto.getNombre()) &&
                producto.VerificarPrecio(producto.getPrecio());
    }
    
    

}

