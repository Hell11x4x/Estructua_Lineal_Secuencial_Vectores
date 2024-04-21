/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 * 
 */
/*
Escribir un algoritmo que aplique un aumento del 15% al sueldo de un trabajdor,
si éste es menor a 1000.
*/
public class Aumento_Sueldo2 {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double cAumento, sueldo;
        
        System.out.println("El sueldo del trabajor es: ");
        sueldo = tecla.nextDouble();
        
        if (sueldo < 1000) {
            cAumento = sueldo * 1.15;
            System.out.println("El nuevo sueldo es: " + cAumento);
        
        }
    }
}
