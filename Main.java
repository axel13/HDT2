package ejercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Axel
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    // el "throws FileNotFoundException, IOException" se utilizo por sugerencia de netbeans
    
    //se crea un Vector donde se almacenaran las lineas del archivo
    Vector lines = new Vector();
    
    //la lectura para un archivo .txt se obtuvo de un ejemplo compartido publicamente
    // por el usuario de stackoverflow "Knubo" (se hicieron algunas modificaciones)
    BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
    try {
        String line = br.readLine();

        while (line != null) {
            lines.add(line);
            line = br.readLine();
        }    
    } finally {
        br.close();
    }
    
    
    Calculos cal = new Calculos();
    VectorStack pila = new VectorStack();
    String[] resultados = new String[lines.size()];
    
    cal.leer(lines, pila, resultados);
    
    System.out.println(resultados);
    
    
    
    
    
        
    }
    
}
