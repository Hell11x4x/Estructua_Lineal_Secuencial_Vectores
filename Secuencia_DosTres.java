/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hell
 */
public class Secuencia_DosTres {
    public static void main (String [] args) {
        
        int numero;
        double suma;
        
        numero = 0;
        suma = 0;
        
        while (numero < 1800) {
            numero = numero + 2;
            System.out.print(numero + ",");
            suma = suma + numero;
            
            numero = numero + 3;
            System.out.print(numero + ",");
            suma = suma + numero;
        }
        
        System.out.println("La suma total es: " + suma);
    }
}
