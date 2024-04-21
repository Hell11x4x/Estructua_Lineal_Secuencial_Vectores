/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Continuar_Salir {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner (System.in);
        String opcion;
        
        System.out.println("Desea continuar?");
        opcion = teclado.nextLine();
        
        while (!opcion.equals("S") && !opcion.equals("N")){
            System.out.println("Ingrese solo S / N");
            opcion = teclado.nextLine();   
        }
        
        if (opcion.equals("S")) {
            System.out.println("Usted continua");
            System.out.println("Desea continuar nuevamente?");
            opcion = teclado.nextLine();
            
            while (!opcion.equals("S") && !opcion.equals("N")) {
                System.out.println("Ingrese solo S / N");
                opcion = teclado.nextLine();
            }
            
            while (opcion.equals("S")) {
                System.out.println("Usted continua");
                System.out.println("Desea continar nuevamente?");
                opcion = teclado.nextLine();
                
                while (!opcion.equals("S") && !opcion.equals("N")) {
                    System.out.println("Ingrese solo S / N");
                    opcion = teclado.nextLine();
                if (opcion.equals("S")){
                    System.out.println();
                } else {
                    System.out.println("Usted salió");
                }
                }
            }
        } else {
            System.out.println("Usted salió");
        }
    }
}
