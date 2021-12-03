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
// Java program to implement Schonhage-Strassen's
// Multiplication Algorithm
import java.math.BigInteger;
 
class GFG {
    BigInteger a, b;
    BigInteger[] array;
    static int length;

    public GFG(String x, String y) {
        this.a = new BigInteger(x);
        this.b = new BigInteger(y);
    }
    
    // to count the no.of digits in each of
    // the given values a and b
    public int countDigits(BigInteger num)
    {
        String x = num.toString();
        int a = x.length();
        return a;
    }
 
    // to perform schonhage-Strassen's Multiplication
    void schonhageStrassenMultiplication()
    {
        // first find the LinearConvolution
        findLinearConvolution();
        // Then perform carry on it
        performCarry();
    }
 
    
    public void findLinearConvolution()
    {
        
        int aDigits = countDigits(a);
        int bDigits = countDigits(b);
        BigInteger temp = a;
       
        length = aDigits + bDigits;
        this.array = new BigInteger[length];
        BigInteger x = new BigInteger("10");
        for (int i = 0; i < array.length; i++) {
            array[i] = new BigInteger("0");
        }
        for (int i = 0; i < aDigits; i++) {
            a = temp;
            
            for (int j = 0; j < bDigits; j++) {
                BigInteger a2 = a.divide(x).multiply(x);
                BigInteger b2 = b.divide(x).multiply(x);
                BigInteger c = a.subtract(a2);
                BigInteger d = b.subtract(b2);
                array[i+j] = array[i+j].add(c.multiply(d));
                
                a = a.divide(x);
            }
            b = b.divide(x);
        }
    }
 
    // to perform carry on the obtained LinearConvolution
    public void performCarry()
    {
        // initialize product to 0
        BigInteger product = new BigInteger("0");
        BigInteger carry = new BigInteger("0");
        BigInteger base = new BigInteger("1");
        BigInteger x = new BigInteger("10");
        // for every value in the LinearConvolution
        for (int i = 0; i < length; i++) { 
            array[i] = array[i].add(carry);
            BigInteger c = array[i].divide(x).multiply(x);
            BigInteger d = array[i].subtract(c);
            d = d.multiply(base);
            product = product.add(d);
            carry = array[i].divide(x);
            base = base.multiply(x);
            
        }
        System.out.println("The Product is : " + product);
    }
 
    // Driver method
    public static void main(String[] args)
    {
    }
}