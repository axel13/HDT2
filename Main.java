package ejercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        // TODO code application logic here
        
    Vector lines = new Vector();
        
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
