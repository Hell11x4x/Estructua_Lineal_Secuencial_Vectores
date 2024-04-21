/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Aumento_Sueldo3 {
    public static void main (String [] args) {
        Scanner tecla =new Scanner (System.in);
        
        double sueldo, nSueldo;
        
        System.out.println("Ingrese el sueldo del trabajdor");
        sueldo = tecla.nextDouble();
        
        if (sueldo < 1000) {
            nSueldo = sueldo * 1.15;
            System.out.println("El nuevo sueldo del trabjador es un 15% más: " + nSueldo);
            
        } else {
            nSueldo = sueldo * 1.12;
            System.out.println("El nuevo sueldo del trabajador es un 12% más: " + nSueldo);
        
        }
  
    }
    
}
