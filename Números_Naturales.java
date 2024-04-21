/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Números_Naturales {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        double calculo;
        
        
        calculo = 0;
        numero = 0;
        
        System.out.println("Ingrese un número positivo o natural");
        numero = teclado.nextInt();
        
        if (numero < 0) {
            while (numero < 0) {
                System.out.println("Erro. Ingrese un número positivo o mayor a 0");
                numero = teclado.nextInt();
            }
        }
        
        if (numero > 0) {
            while (numero > 0) {
                calculo = calculo + numero;
                System.out.println("Desea ingresar más números positivos?");
                numero = teclado.nextInt();
                
                if (numero == 0) {
                    System.out.println("Ustede quiere salir");
                    System.out.println("Dijite 0 para confirmar en salir");
                    numero = teclado.nextInt();
                }
            }
        }
        
     
        double resultado = Math.pow(calculo, 3);
        
        System.out.println("El cubo de esos números es: " + resultado);
    }
}
