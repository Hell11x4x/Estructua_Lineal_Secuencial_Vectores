/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Construya el algoritmo tal que, 
DADO EL RADIO, LA GENERATRIZ Y LA ALTURA DE UN CONO,
CALCULE E IMPRIME EL ÁREA DE LA BASE, EL ÁREA LATERAL, EL ÁREA TOTAL Y SU VOLUMEN.
*/
package estructura_secuencial;
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Calculo_Cono {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
          
          double radio, generatriz, altura, aBase, aLateral, aTotal, volumen;
          final double PI = Math.PI;
         
            
          System.out.println("PARA CALCULAR LO REQUERIDO DEL CONO");
          System.out.println("Ingrese el radio");
          radio = tecla.nextDouble();
          System.out.println("Ingrese la generatriz");
          generatriz = tecla.nextDouble();
          System.out.println("Ingrese la altura");
          altura = tecla.nextDouble();
          
          aBase = PI * Math.pow(radio, 2);
          aLateral = PI * radio * generatriz;
          aTotal = aBase + aLateral;
          volumen = (aBase * altura)/3;
          
          System.out.println("LOS RESULTADOS SON");
          System.out.println("Área base: " + aBase);
          System.out.println("Área lateral: " + aLateral);
          System.out.println("Área total: " + aTotal);
          System.out.println("Volumen: " + volumen);
          
    }
    
}
