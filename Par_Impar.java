/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Par_Impar {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        int numero, parImpar;
        
        System.out.println("Ingrese un número: ");
        numero = tecla.nextInt();
        
        parImpar = numero % 2;
        
        if (parImpar == 0 ){
            System.out.println("Es par");
        
        } else {
            System.out.println("Es impar");
        
        }
    
    }
    
}
