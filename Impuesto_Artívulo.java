/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Impuesto_Artívulo {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner(System.in);
        double costo, impuesto, costoTotal;
        
        System.out.println("Ingrese costo del atículo: ");
        costo = teclado.nextDouble();
        
        if (costo < 100) {
            impuesto = 1.00;
            costoTotal = costo * impuesto;
            
            System.out.println("Impuesto: 0%");
            System.out.println("Costo total: " + costoTotal);
        } else {
            if (costo >= 100 && costo < 1000) {
                impuesto = 1.10;
                costoTotal = costo * impuesto;
                
                System.out.println("Impuesto: 10%");
                System.out.println("Costo total: " + costoTotal);
            } else {
                impuesto = 1.18;
                costoTotal = costo * impuesto;
                
                System.out.println("Impuesto: 18%");
                System.out.println("Costo total: " + costoTotal);
            }
        }
    }
    
}
