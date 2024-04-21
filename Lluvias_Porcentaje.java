/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Lluvias_Porcentaje {
    public static void main (String [] args){
        
        Scanner tecla = new Scanner(System.in);
        
        int mayorLluvia, menorLluvia, mes;
        String region;
        double promedio;
        mayorLluvia = 0;
        menorLluvia = 100;
        region = "";
        mes = 0;
        promedio = 0;
        int[] norte = new int[12];
        int[] centro = new int[12];
        int[] sur = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", 
        "Septiembre", "Octube", "Noviembre", "Diciembre"};
        
        System.out.println("Los porcentajes de la lluvia van de 0% al 100%");
        
        for (int i = 0; i < 11; i ++) {
            System.out.println("Ingrese los porcentajes de lluvia para la zona Norte");
            norte[i] = tecla.nextInt();
            
            if (mayorLluvia < norte[i]) {
                mayorLluvia = norte[i];
                region = "Norte";
            }
        }
        
        for (int i = 0; i <= 11; i ++) {
            System.out.println("Ingrese porcentaje de la lluvia para la zona Centro");
            centro[i] = tecla.nextInt();
            
            promedio = promedio + centro[i];
            
            if (mayorLluvia < centro[i]) {
                mayorLluvia = centro[i];
                region = "Centro";
            }
        }
        
        for (int i = 0; i < 11; i ++) {
            System.out.println("Ingrese porcentaje de las lluvias para la zona Sur");
            sur[i] = tecla.nextInt();
            
            if (mayorLluvia < sur[i]) {
                mayorLluvia = sur[i];
                region = "Sur";
            }
            
            if (menorLluvia > sur[i]) {
                menorLluvia = sur[i];
                mes = i;
            }
        }
        promedio = promedio / 12;
        System.out.println("Promedio anual de la región Centro es: " + promedio);
        System.out.println("El mes con menor lluvia en la región Sur es: " + meses[mes]);
        System.out.println("La región con mayor lluvia es: " + region);
    }
}
