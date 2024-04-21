/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_secuencial;
import java.util.Scanner;

/**
 *
 * @author Hell
 */
public class Inversion_Ganancia {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
          int mes;
          double capital,interes,ganancia;
          interes = 0.02;
          
          System.out.println("Ingrese monto de capital a invertir");
          capital = teclado.nextDouble();
          System.out.println("Ingrese los meses a invertir");
          mes = teclado.nextInt();
          
          
          ganancia = capital*mes*interes;
          
          System.out.println("Su ganancia de "+ capital+ " en "+ mes+ " meses es de: "+ ganancia);
          
    
    }
    
}
