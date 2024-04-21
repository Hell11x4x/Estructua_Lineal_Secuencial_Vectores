/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Cálculo_Temperatura {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        double cTemperatura, sonidos;
        
        System.out.println("Ingrese número de sonidos del grillo");
        sonidos = teclado.nextDouble();
        
        if (sonidos > 0) {
            cTemperatura = (sonidos / 4) + 40;
            System.out.println("La temperatura es: " + cTemperatura);
        
        }
    
    }
    
}
