/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class SI_Simple {
    public static void main(String[]argas){
        Scanner tecla = new Scanner(System.in);
        
        double sueldo, nuevoSueldo;
        
        System.out.println("El sueldo del trabajador es: ");
        sueldo = tecla.nextDouble();
        
        //Estructura selectiva simple (SI simple)
        if(sueldo < 1000){
            nuevoSueldo = sueldo*1.15;
            System.out.println("El nuevo sueldo es: " + nuevoSueldo);  
        
        }
    }  
}
