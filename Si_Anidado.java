/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Si_Anidado {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        double numero;
        
        
        System.out.println("Ingrese un número");
        numero = teclado.nextDouble();
        
        //Estructura algorítmica, múltipe o anidada.
        
        if (numero < 0){
            System.out.println("El número es negativo (-)");
        
        } else if (numero > 0){
            System.out.println("El número es positivo (+)");
        
        } else {
                System.out.println("El número es nulo (0)");
        
        }
      
    }
    
}
