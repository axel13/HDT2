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
    
    
    
    
    public void leer(Vector lineas, VectorStack pila, String[] resultados){
        
        String[] vLinea;
        String resultado;
            
        for(int x=0; x<lineas.size(); x++){
            
             vLinea = new String[lineas.get(x).toString().length()];
            
            for(int i=0; i<lineas.get(x).toString().length(); i++){
                vLinea[i] = String.valueOf(lineas.get(x).toString().charAt(i));    
            }
            
            for(int y=0; y<vLinea.length; y++){
                
                int a,b;
                
                switch(vLinea[y]){
                    case "+":
                        a = (int) pila.pop();
                        b = (int) pila.pop();
                        
                        suma(a,b);
                        pila.push(getAns());
                        break;
                    
                    case "-":
                        a = (int) pila.pop();
                        b = (int) pila.pop();
                        
                        resta(a,b);
                        pila.push(getAns());
                        break;
                        
                    case "*":
                        a = (int) pila.pop();
                        b = (int) pila.pop();
                        
                        mul(a,b);
                        pila.push(getAns());
                        break;
                     
                    case "/":
                        a = (int) pila.pop();
                        b = (int) pila.pop();
                        
                        div(a,b);
                        pila.push(getAns());
                        break;
                        
                    case " ":
                        break;
                        
                }
                
                try{
                    if(Integer.parseInt(vLinea[y]) >= 0){
                        pila.push(Integer.parseInt(vLinea[y]));
                    }
                } finally {}
              
            } 
            
            resultado = "\nEl resultado de la linea "+(x+1)+" es: "+getAns();
            resultados[x] = resultado;
                
        }
            
            
    }
        
    
    
    
    public void suma(int a, int b){
        answer = a + b;
    }
    
    public void resta(int a, int b){
        answer = b - a;
    }
    
    public void mul(int a, int b){
        answer = a * b;
    }
    
    public void div(int a, int b){
        answer = b / a;
    }
    
    public int getAns(){
        return answer;
    }
    
    
    
   

        
            
}
