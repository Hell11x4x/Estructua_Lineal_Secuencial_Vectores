/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Cálculo_pPentalgonal2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        double aTotal, aLateral, aBase, perimetro, apotema, altura;
        
        System.out.println("Ingrese perímetro");
        perimetro = teclado.nextDouble();
        System.out.println("Ingrese apotema");
        apotema = teclado.nextDouble();
        System.out.println("Ingrese altura");
        altura = teclado.nextDouble();
        
        aLateral = perimetro * altura;
        aBase = (perimetro * apotema)/2;
        aTotal = aLateral + 2 * aBase;
        
        System.out.println("Los resultados son");
        System.out.println("Área total: " + aTotal);
        System.out.println("Área lateral: " + aLateral);
        System.out.println("Área base: " + aBase);
    
    }
    
}
