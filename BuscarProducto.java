import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BuscarProducto {
    
    public void Buscar(String codigo,String nombreDeArchivo){
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader(nombreDeArchivo));
            String cadenaLeida= reader.readLine();
            Object [] datos=new Object[3];
            while (cadenaLeida!=null) {
                StringTokenizer as=new StringTokenizer(cadenaLeida,"||");
                datos[0]=as.nextToken();
                datos[1]=as.nextToken();
                datos[2]=as.nextToken();
                if (datos[1].equals(codigo)) {
                    System.out.println("Nombre del producto: "+datos[0]);
                    System.out.println("Codigo del producto: "+datos[1]);
                    System.out.println("Precio del producto: "+datos[2]);
                }
                cadenaLeida=reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            
        }finally{
            try {
                reader.close();
            } catch (Exception e) {
               
            }
        }
    }
}
