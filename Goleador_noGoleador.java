/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Goleador_noGoleador {
    public static void main (String[]args){
        Scanner tecla = new Scanner(System.in);
        
        String nombrej;
        double numerog;
        
        System.out.println("Ingrese el nombre del jugador: ");
        nombrej = tecla.nextLine();
        System.out.println("Ingrese el número de goles del jugador: ");
        numerog = tecla.nextDouble();
        
        if (numerog >= 6){
            System.out.println("Jugador: " + nombrej);
            System.out.println("GOLEADOR");
        
        } else {
            System.out.println("Jugador: " + nombrej);
            System.out.println("NO GOLEADOR");
        
        }
    
    }
    
}
