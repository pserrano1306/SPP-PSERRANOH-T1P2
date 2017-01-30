/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.t1p2;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHT1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Pablo Serrano Hernández A01410753 (IMT)
        System.out.println("Calculadora de Perimetro y superficie de un rectangulo");
        //variables
        Scanner teclado =new Scanner (System.in);
       
        double sup, per,base,altu;
        
        //Ejecucion
        System.out.println("Ingrese la medida de la base");
        base = teclado.nextDouble();
       
        
        System.out.println("Ingrese la medida de la altura");
        altu = teclado.nextDouble();
        
        
        // Calculos
        per = (2*base)+(2*altu);
        sup = base*altu;
       
        
        
      //Resultados
        System.out.println ("El perimetro del rectangulo es de "+per);
        System.out.println("La superficie del rectangulo "+ sup);
    }
    
}
