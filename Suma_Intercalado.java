/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hell
 */
public class Suma_Intercalado {
    public static void main (String [] args){
        
        int i, suma;
        
        i = 0;
        suma = 0;
        
        while (i < 1800) {
            i = i + 2;
            System.out.println(i);
            suma = suma + i;
            
            i = i + 3;
            System.out.println(i);
            suma = suma + i;
            
        }
        
        System.out.println("La suma es: " + suma);
    }
}
