/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

/**
 *
 *
 */
import java.math.BigInteger;

 class RussianMultiplication {
    BigInteger num1;
    BigInteger num2;

    public RussianMultiplication(String num1, String num2) {
        this.num1 = new BigInteger(num1);
        this.num2 = new BigInteger(num2);
    }
    
    
    public void multiplicacion(){
     BigInteger product = new BigInteger("0");
     BigInteger ii = new BigInteger("2");
     BigInteger c = num1.divide(ii).multiply(ii);
     c = num1.subtract(c);
     if(c.longValue()!=0)
      product=product.add(num2);
     while(num1.longValue()!=1)
     {
      num1=num1.divide(ii);
      num2=num2.multiply(ii);
      BigInteger d = num1.divide(ii).multiply(ii);
      d = num1.subtract(d);
      if(d.longValue()!=0)
       product=product.add(num2);
     }

     System.out.println("The product is: "+product.toString());
    }
    public static void main(String[] args){
        String a = "1256";
        String b = "3863";
        RussianMultiplication test = new RussianMultiplication(a, b);
        test.multiplicacion();
    }
}
