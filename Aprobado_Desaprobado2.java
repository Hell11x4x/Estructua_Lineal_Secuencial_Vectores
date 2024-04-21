/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Construra un algoritmo dado como dato la calificación de un alumno en un examen, 
escrriba "APROBADO" si su calificación es mayor o igual que 8 y que "REPROBADO en caso contrario.
*/
//importamos Scanner para capturar datos que pulsamos en el teclado.
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Aprobado_Desaprobado2 {
    public static void main (String [] args) {
        Scanner tecla = new Scanner (System.in);
        
        int calificacion;
        
        System.out.println("Ingrese la calificación del alumno");
        calificacion = tecla.nextInt();
        
        if (calificacion >= 8) {
            System.out.println("APROBADO");
        
        }else {
            System.out.println("DESAPROBADO");
        
        }
        
    }
    
}
