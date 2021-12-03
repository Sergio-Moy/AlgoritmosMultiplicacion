/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

/**
 *
 * @author Sergi
 */
public class Stopwatch {
    private final long start;
    public Stopwatch() {
        start = System.currentTimeMillis();
    }
    public double elapsedtime(){
        long now = System.currentTimeMillis();
        return (now - start*1.0);
    }
    
}
