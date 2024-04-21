/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Aumento_Sueldo {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        double sueldo, nSueldo;
        
        System.out.println("El sueldo del trabajador es: ");
        sueldo = teclado.nextDouble();
        
        if( sueldo < 1000 ){
            nSueldo = sueldo * 1.15;
            System.out.println("El nuevo sueldo es: " + nSueldo);
        
        }
    
    }
    
}
