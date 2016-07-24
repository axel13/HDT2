/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Vector;

/**
Axel Mazariegos
Gustavo Orellana
 * @param <E>
 */
public class VectorStack<E> implements Istack<E> {

    private Vector stack;

    /**
     *
     */
    public VectorStack(){
        stack = new Vector();
    }

    /**
     *
     * @param a
     */
    public void push(E a) {
        stack.add(a);
    }

    /**
     *
     * @return
     */
    public E pop() {

        Object last = stack.lastElement();
        stack.remove(stack.size()-1);
        return (E) last;

    }


}
