/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Vector;


/**
 *
 * @author Axel
 */
public class Calculos {
    
    
    int answer = 0;
    
    public Calculos(){}
    
    public void leer(Vector lineas){
            
        for(int x=0; x<lineas.size(); x++){
            
            String[] vLinea = new String[lineas.get(x).toString().length];
            
            for(int i=0; i<lineas.get(x).toString().length; i++){
                vLinea[i] = String.valueOf(lineas.get(x).toString().charAt(i));    
            }
            
            for(int y=0; y<vLinea.length; y++){
                
                switch(vLinea[y]){
                    case "+":
                        
                        
                }
                
            }
            
            
        }
        
    
    }
    
    public void Suma(int a, int b){
        answer = a + b;
    }
    
    public void Resta(int a, int b){
        answer = a - b;
    }
    
    public void Mul(int a, int b){
        answer = a * b;
    }
    
    public void Div(int a, int b){
        answer = a / b;
    }
    
    public int getAns(){
        return answer;
    }
    
    
    
    
    
    
   

        
            
}
