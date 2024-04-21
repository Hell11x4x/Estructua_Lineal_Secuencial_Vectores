/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* Un constructor sabe que necesita 0.5 metros cúbicos de arena por metro cuadrado de revoque a realizar.
ESCRIBE UN ALGORIRMO QUE LE PERMITA OBETENER LA CANTIDAD DE ARENA NECESARIA 
PARA REVOCAR UNA PARED CUALQUIERA, 
SEGÚN SUS MEDIDAS (LARGO Y ANCHO) EXPRESADAS EN METROS

*/
package estructura_secuencial;
import java.util.Scanner;

/**
 *
 * @author Hell
 */
public class Cantidad_Arena {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double metro, largo, ancho, requerido, pared;
        
        System.out.println("Para sacar los metros cuadrados de una pared");
        System.out.println("Ingrese el largo de la pared");
        largo = tecla.nextDouble();
        System.out.println("Ingrese el ancho de la pared");
        ancho = tecla.nextDouble();
        
        metro = 0.5;
        
        pared = largo * ancho;
        
        requerido = (largo * ancho)*metro;
        
        System.out.println("Para rellenar " + pared + " metros cuadrado de pared" );
        System.out.println("Se necesita "+ requerido + " metros cúbicos de arena");
        
    
    }
    
    
}
