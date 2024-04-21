/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Par_Impar2 {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        int numero, dNumero;
        
        System.out.println("Ingrese un número: ");
        numero = tecla.nextInt();
        
        dNumero = numero % 2;
        
        if (dNumero == 0 ){
            System.out.println(numero + " es par.");
        
        } else {
            System.out.println(numero + " es impar.");
        
        }
    
    }

}
