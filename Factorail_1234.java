/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Factorail_1234 {
    public static void main (String [] args) {
        
        Scanner tecla = new Scanner (System.in);
        int numero;
        double factorial;
        
        factorial = 1;
        
        System.out.println("Ingrese un número");
        numero = tecla.nextInt();
        
        for (int i = 1; i <= numero; i += 1) {
            System.out.println(i);
            factorial = factorial * i;
        }
        
        System.out.println("La factorial es: " + factorial);
    }
}
