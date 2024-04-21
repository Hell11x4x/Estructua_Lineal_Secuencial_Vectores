/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Cálculo_Triángulo {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double xuno, yuno, xdos, ydos, xtres, ytres, iArea;
        
        System.out.println("Ingrese las coordenadas para");
        System.out.println("x1");
        xuno = tecla.nextDouble();
        System.out.println("y1");
        yuno = tecla.nextDouble();
        System.out.println("x2");
        xdos = tecla.nextDouble();
        System.out.println("y2");
        ydos = tecla.nextDouble();
        System.out.println("x3");
        xtres = tecla.nextDouble();
        System.out.println("y3");
        ytres = tecla.nextDouble();
        
        iArea = (xuno*(ydos - ytres) + xdos*(ytres - yuno) + xtres*(yuno - ydos))/2;
        
        System.out.println("El área del triángulo es: " + iArea);
    
    }
    
    
    
}
