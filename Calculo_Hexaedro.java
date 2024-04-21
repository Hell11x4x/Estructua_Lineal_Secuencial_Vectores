/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Calculo_Hexaedro {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double lado, aBase, aLateral, aTotal, iVolumen;
        
        System.out.println("Ingrese el lado del hexaedro");
        lado = tecla.nextDouble();
        
        aBase = Math.pow(lado, 2);
        aLateral = 4*Math.pow(lado, 2);
        aTotal = 6*Math.pow(lado, 2);
        iVolumen = Math.pow(lado, 3);
        
        System.out.println("El área base es: " + aBase);
        System.out.println("El área lateral es: " + aLateral);
        System.out.println("El área total es: " + aTotal);
        System.out.println("El volumen es: " + iVolumen);
    
    }
    
}
