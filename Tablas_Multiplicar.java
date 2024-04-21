/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Tablas_Multiplicar {
    public static void main (String [] args){
        
        Scanner tecla = new Scanner(System.in);
        int tabla;
        
        
        System.out.println("Ingrese que tabla desea para multiplicar");
        tabla = tecla.nextInt();
        
        for (int i = 0; i <= 20; i ++) {
            double resultado = i * tabla;
            System.out.println(i + " X " + tabla + " = " + resultado);
        }
    } 
}
