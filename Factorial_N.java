/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Factorial_N {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        double resultado;
        
        resultado = 1;
        
        System.out.println("Ingrese un número: ");
        numero = teclado.nextInt();
        
        for (int i = 1; i <= numero; i ++) {
            System.out.println(i);
            resultado = resultado * i;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}
