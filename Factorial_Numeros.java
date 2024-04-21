/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Factorial_Numeros {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        double factorial = 1;
        
        System.out.println("Ingrese un número: ");
        numero = teclado.nextInt();
        
        for (int i = 1; i <= numero; i ++) {
            System.out.println(i);
            factorial *= i;  
        }
        
        System.out.println("La factorial es: " + factorial);
    }
}
