/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Gastos_Viajes {
    public static void main(String [] args){
        
        Scanner teclado = new Scanner (System.in);
        double total, gasto;
        
        total = 0;
        gasto = 0;
        
        System.out.println("Ingrese los gastos realizados que se acuerda");
        gasto = teclado.nextDouble();
        
        if (gasto == 0) {
            System.out.println("No hubo gastos");
        }
        
        while (gasto != 0) {
            total = total + gasto;
            System.out.println("Conteo de sus gastos: " + total);
            
            System.out.println("Hay más gastos:? ");
            gasto = teclado.nextDouble();
            
            if (gasto == 0) {
                System.out.println("No hay más gastos");
            }
        }
        
        System.out.println("El gasto total es: S/." + total);
    }
}
