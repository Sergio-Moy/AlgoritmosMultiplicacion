/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

/**
 *
 * @author Hp
 */
import java.math.*;
public class prueba {
    
    public static void main(String[] args) {
        String a = "4820486928496028584028258493069294839205843729";
        String b = "2040294018486948283958371239530294897438258643";
        System.out.println("Algoritmo Ruso:");
        RussianMultiplication test1 = new RussianMultiplication(a, b);
        Stopwatch x = new Stopwatch();
        test1.multiplicacion();
        double x2 = x.elapsedtime();
        System.out.println("Tiempo del Algoritmo Ruso: "+x2+"ms\n");
        
        System.out.println("Algoritmo de Schonhage y Strassen: ");
        GFG test2 = new GFG(a, b);
        Stopwatch y = new Stopwatch();
        test2.schonhageStrassenMultiplication();
        double y2 = y.elapsedtime();
        System.out.println("Tiempo del algoritmo de Schonhage y Strassen: "+y2+"ms\n");
        
        System.out.println("Algoritmo de Karatsuba: ");
        AlgoritmoKaratsuba test3 = new AlgoritmoKaratsuba();
        Stopwatch z = new Stopwatch();
        String c = test3.mul(a, b);
        System.out.println("The result is: "+c);
        double z2 = z.elapsedtime();
        System.out.println("Tiempo del algoritmo de Karatsuba: "+z2+"ms\n");
        
        System.out.println("El algoritmo más rapido fue el "+menor(x2, y2, z2));
        System.out.println("El algoritmo más lento fue el "+mayor(x2, y2, z2));
        
    }
    public static String mayor(double a, double b, double c){
        if (a == Math.max(Math.max(a, b), c)) {
            return "algoritmo ruso";
        }
        else if ((b == Math.max(Math.max(a, b), c))) {
            return "de Schonhage y Strasser";
        }
        else{
            return "de Karatsuba";
        }
    }
    
    public static String menor(double a, double b, double c){
        if (a == Math.min(Math.min(a, b), c)) {
            return "algoritmo ruso";
        }
        else if ((b == Math.min(Math.min(a, b), c))) {
            return "de Schonhage y Strasser";
        }
        else{
            return "de Karatsuba";
        }
    }
}
