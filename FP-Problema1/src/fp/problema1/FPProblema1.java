/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema1;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class FPProblema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Calcular si un año es bisiesto
        int a;
        a = solicitarAnyo(); //Aqui se pide el año
        calcularymostrar(a); //Aqui se muestra si es o no bisiesto
    }

        
    public static int solicitarAnyo() { //Solicitar numero de año
        System.out.print("Introduce el año");
        Scanner teclado = new Scanner(System.in);
        int a;
        a = teclado.nextInt();
        return a;
    }
    public static void calcularymostrar(int a) { //Calcular si es bisiesto y mostrar resultado
        if ( ((a%4) == 0) && ((a % 100) != 0) || ((a % 400) == 0) )
         { System.out.println("El año " + a + " es bisiesto"); }
        else { System.out.println("El año " + a + " no es bisiesto");}
    
        
}
}