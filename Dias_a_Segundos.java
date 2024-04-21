/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Dias_a_Segundos {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double dias, cCalculo;
        
        System.out.println("Ingrese los dias para convertirlo a segundos");
        dias = tecla.nextDouble();
        
        cCalculo = (dias * 24) * 3600;
        
        System.out.println("En: " + dias + " días hay: " + cCalculo + " segundos.");
    
    }
    
}
