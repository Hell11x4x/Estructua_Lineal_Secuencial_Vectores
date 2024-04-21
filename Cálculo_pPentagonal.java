/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Cálculo_pPentagonal {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double perimetro, apotema, altura, aBase, aLateral, aTotal, cVolumen;
        
        System.out.println("Ingrese los datos para el calculo");
        System.out.println("Ingrese perímetro de la base: ");
        perimetro = tecla.nextDouble();
        System.out.println("Ingrese la apotema: ");
        apotema = tecla.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = tecla.nextDouble();
        
        aBase = (perimetro * apotema)/2;
        aLateral = perimetro * altura;
        aTotal = 2*aBase + aLateral;
        cVolumen = aBase * altura;
        
        System.out.println("Resultados");
        System.out.println("Área base: " + aBase);
        System.out.println("Área latera: " + aLateral);
        System.out.println("Área total: " + aTotal);
        System.out.println("Volumen: " + cVolumen);
    
    }
}
