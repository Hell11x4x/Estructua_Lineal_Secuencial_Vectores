/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Realizar la suma de los 100 primeros números
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Suma_100primeros {
    public static void main(String [] args){
        
        int i, suma;
        
        i = 1;
        suma = 0;
        
        while (i <= 100) {
            suma = suma + i;
            i = i + 1;
        }
        
        System.out.println("La suma de los 100 primeros números enteros es: " + suma);
    }
}
