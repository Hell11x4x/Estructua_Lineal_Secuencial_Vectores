/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Media_ParImpar {
    public static void main (String [] args) {
        
        Scanner tecla = new Scanner (System.in);
        int numero, contadorPar, contadorImpar;
        double sumaPar, sumaImpar;
       
        contadorPar = 0;
        contadorImpar = 0;
        sumaPar = 0;
        sumaImpar = 0;
        
        for (int i = 1; i <= 10; i ++) {
            
            System.out.println("-----Ingrese numero: " + i + " -----");
            numero = tecla.nextInt();
            
            if (numero % 2 == 0) {
                contadorPar = contadorPar + 1;
                sumaPar = sumaPar + numero;
            } else {
                contadorImpar = contadorImpar + 1;
                sumaImpar = sumaImpar + numero;
            }
            
            System.out.println("Suma par: " + sumaPar);
            System.out.println("Suma impar: " + sumaImpar);
            System.out.println("Contador par: " + contadorPar);
            System.out.println("Contador impar: " + contadorImpar);
        }
        
        double mediaPar = sumaPar / contadorPar;
        double mediaImpar = sumaImpar / contadorImpar;
        
        System.out.println("La media de los números pares es: " + mediaPar);
        System.out.println("La media de los números impares es: " + mediaImpar);
        
    }
}
