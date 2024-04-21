/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Continuarr {
    public static void main (String [] args){
        
        Scanner teclado = new Scanner(System.in);
        String opcion;
        
        System.out.println("Desea continar?");
        opcion = teclado.nextLine();
        
        while (!opcion.equals("S") && !opcion.equals("N")) {
            System.out.println("Error. Ingrese solo entre S / N");
            opcion = teclado.nextLine();
        }
        
        if (opcion.equals("S")) {
            System.out.println("Usted continua");
            
            while (opcion.equals("S")) {
                System.out.println("Desea continuar nuevamente?");
                opcion = teclado.nextLine();
                
                while (!opcion.equals("S") && !opcion.equals("N")) {
                    System.out.println("Error. Ingrese solo entre S / N");
                    opcion = teclado.nextLine();
                }
                
                if (opcion.equals("S")) {
                    System.out.println("Usted continuar");
                } else {
                    System.out.println("Usted salió");
                }
            }
            
        } else {
            System.out.println("Usted salió");
        }
    }
}
