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
public class prueba500 {
    
    public static void main(String[] args) {
        String a = "18738684333477840328880713436694373137458412259314525151385702395891556269097893492408984557508328199761435840810855303781730211682397916863648838564398589768622881491179338658033969596233688422124330347224050596317439058745000054217030296775471035899873199648143907949837469793328105608781223068394787950321037164227585660263205264392099128885770203272144769072276021553684675639337292623731845719455556379635179608346116212543416120178055043498167681574982131112742955278147656727379915141237033594";
        String b = "51381479676977068927130826349297782471482240367544118818542587715019998493090561535314296600043693567589921167066237579040239993856686149564294629831182337296608335255880671589587415634558346097309231706877146269188261100761431610352281093043579440367268751358691927192165455850310245132391999282924826667918135009952489278116210464256924682220630946379892117298337496496536253316968042719223721185880814493482683542526588934798466822323460294708058658018310367477956124957083408532573495372670432805";
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
