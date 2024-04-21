/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Financiamiento_Vehículo {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        
        double mtotal, pEnganche, pMensual;
        
        System.out.println("Monto total del vehículo: ");
        mtotal = teclado.nextDouble();
        
        if (mtotal > 0) {
            pEnganche = mtotal * 0.35;
            System.out.println("El enganche será de: " + pEnganche);
            
            pMensual = (mtotal - pEnganche) / 18;
            System.out.println("Las mensualidades serán de: " + pMensual);
        
        }
    
    }
    
}
