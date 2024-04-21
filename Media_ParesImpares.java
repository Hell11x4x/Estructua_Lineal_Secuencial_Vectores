/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Media_ParesImpares {
    public static void main (String [] args){
        
        Scanner tecla = new Scanner (System.in);
        int numero, contadorPar, contadorImpar;
        double mediaPar, mediaImpar;
        
        mediaPar = 0;
        contadorPar = 0;
        mediaImpar = 0;
        contadorImpar = 0;
        
        for (int i = 1; i <= 10; i ++ ){
            System.out.println("---Ingrese número: ---" + i);
            numero = tecla.nextInt();
            
            if (numero % 2 == 0) {
                mediaPar = mediaPar + numero;
                contadorPar = contadorPar + 1;
            } else {
                mediaImpar = mediaImpar + numero;
                contadorImpar = contadorImpar + 1;
            }
            
            System.out.println("Contador Par: " + contadorPar);
            System.out.println("Contador Impar: " + contadorImpar);
        }
        
        mediaPar = mediaPar / contadorPar;
        mediaImpar = mediaImpar / contadorImpar;
        
        System.out.println("Media Par: " + mediaPar + " y Media Impar: " + mediaImpar);
    } 
}