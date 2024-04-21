/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Tabla_Multiplicar {
    public static void main (String [] args) {
        
        Scanner tecla = new Scanner (System.in);
        int numero;
        
        System.out.println("Ingrese número de la tabla que desea multiplicar");
        numero = tecla.nextInt();
        
        for (int i = 1; i <= 10; i ++) {
            double resultado = i * numero;
            System.out.println(i + " * " + numero + " = " + resultado);
        }
    }
}
