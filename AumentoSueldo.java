/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class AumentoSueldo {
    public static void main(String [] args){
        
        Scanner teclado = new Scanner(System.in);
        int categoria;
        double sueldo, nuevoSueldo;
        
        System.out.println("Elige su categoría de preferencia: ");
        System.out.println("(1) aumento del 15%");
        System.out.println("(2) aumento del 10%");
        System.out.println("(3) aumento del 8%");
        System.out.println("(4) aumento del 4%");
        categoria = teclado.nextInt();
        System.out.println("Ingrese sueldo del trabajador: ");
        sueldo = teclado.nextDouble();
        
        switch (categoria){
            case 1: 
                nuevoSueldo = sueldo * 1.15;
                break;
            case 2:
                nuevoSueldo = sueldo * 1.10;
                break;
            case 3: 
                nuevoSueldo = sueldo * 1.08;
                break;
            case 4: 
                nuevoSueldo = sueldo * 1.07;
                break;
            default:
                nuevoSueldo = sueldo;
                
        }
        
        System.out.print("Eligió la categoría: " + categoria);
        System.out.println("");
        System.out.print("Su nuevo sueldo es de: " + nuevoSueldo);
    }
    
}
