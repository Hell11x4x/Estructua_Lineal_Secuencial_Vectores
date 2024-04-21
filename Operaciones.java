/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Operaciones {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner (System.in);
        int opcion, numero;
        double resultado;
        
        System.out.println("Operaciones");
        System.out.println("(1) Multiplicar 100 * X");
        System.out.println("(2) Potencia 100 ^ X");
        System.out.println("(3) Dividir 100 / X");
        System.out.print("Elije una opción: ");
        opcion = teclado.nextInt();
        System.out.println("Ingrese un número para operar con 100: ");
        numero = teclado.nextInt();
        
        switch (opcion) {
            case (1): 
                resultado = 100 * numero;
                break;
            case (2):
                resultado = 100 ^ numero;
                break;
            case (3): 
                resultado = 100 / numero;
                break;
            default:
                resultado = 0;
                break;
        }
        
        System.out.print("El resulado es: ");
        System.out.print(resultado);
    }
    
}
