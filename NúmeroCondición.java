/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class NúmeroCondición {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero aleatorio: ");
        numero = teclado.nextInt();
        
        if(numero == 0){
            System.out.println(numero + " es nulo.");
        } else {
            if(numero > 0){
                System.out.println(numero + " es positivo.");
            }else{
                if (numero < 0){
                    System.out.println(numero + " es negativo.");
                }
            }
        }
    
    }
    
}
