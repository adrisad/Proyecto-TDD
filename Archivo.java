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
    public void CrearRegistro(String NombreArchivo){
        try {
            // A partir del objeto File creamos el fichero físicamente
            File fichero = new File ("C:\\Users\\adran\\Documents\\ProyectoTDD",NombreArchivo);
            if (fichero.createNewFile())
              System.out.println("El registro se ha creado correctamente");
            else
              System.out.println("No ha podido ser creado el registro");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public void RegistrarProducto(Producto producto,String NombreArchivo){
        FileWriter escribir=null;
        try{
            escribir=new FileWriter(NombreArchivo);
            escribir.write(producto.getNombre());
            escribir.write("||");
            escribir.write(producto.getCodigo());
            escribir.write("||");
            escribir.write(producto.getPrecio());
            escribir.close();
            fail("No se pudo registrar el producto");
        } catch (Throwable e) {
            
        }
    }
    */
    /* 
    public void inici() {
		File f = new File("C:\\Users\\adran\\Documents\\ProyectoTDD\\fichero.txt");
		Scanner lector = null;
		try {
			lector = new Scanner(f);
			while (lector.hasNextLine()) {
				String linia = lector.nextLine();
				File fitxer = new File("Resultat.txt");
				PrintStream escriptor = new PrintStream(fitxer);
				String fiDeLinea = System.getProperty("line.separator");
				escriptor.print(linia + fiDeLinea);
				escriptor.close();
			}
		} catch (Exception ex) {
			System.out.println("Missatge: " + ex);
		}
    }
    /*
        escriir();
         
        Scanner scanner = new Scanner(System.in);
	    System.out.println("Introduce una cadena de texto a buscar: ");
	    String request = scanner.next();
	 	try {
			final BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\adran\\Documents\\ProyectoTDD\\fichero.txt"));
			String line = "";
			while((line = lector.readLine())!= null){
				if(line.indexOf(request)!= -1){
					System.out.println(""+line);
				}
			}lector.close();
	 	} catch (FileNotFoundException e) {
            e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
		}
        */

}

