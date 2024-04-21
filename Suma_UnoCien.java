/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hell
 */
public class Suma_UnoCien {
    public static void main (String [] args){
        
        int suma = 0;
        
        for (int i = 1; i <= 100; i ++) {
            System.out.println(i);
            suma = suma + i;
        }
        
        System.out.println("La suma es: " + suma);
    }
}
