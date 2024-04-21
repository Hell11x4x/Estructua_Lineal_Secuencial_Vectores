/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Temperatura_Sonido {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double cTemperatura, numero;
        
        System.out.println("Ingrese el número de sonido emitidos por el grillo: ");
        numero = tecla.nextDouble();
        
        if ( numero > 0) {
            cTemperatura = (numero / 4) + 40;
            System.out.println("La temperatura es de: " + cTemperatura);
        
        }
    
    }
    
}
