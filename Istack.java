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
 * @param <E>
 */
public interface Istack<E> {
    
    /**
     *
     * @param data
     */
    public void push(E data);
    
    /**
     *
     * @return
     */
    public E pop();
    
  
}
