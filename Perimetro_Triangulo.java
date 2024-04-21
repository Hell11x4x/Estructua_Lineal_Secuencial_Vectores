/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Perimetro_Triangulo {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
          double pUno, pDos, pTres, xuno, yuno, xdos, ydos, xtres, ytres, iPerimetro;
          
          System.out.println("Ingrese las coordenada para:");
          System.out.println("x1: ");
          xuno = tecla.nextDouble();
          System.out.println("y1: "); 
          yuno = tecla.nextDouble();
          System.out.println("x2: ");
          xdos = tecla.nextDouble();
          System.out.println("y2: ");
          ydos = tecla.nextDouble();
          System.out.println("x3: ");
          xtres = tecla.nextDouble();
          System.out.println("y3: ");
          ytres = tecla.nextDouble();
          
          pUno = Math.sqrt(Math.pow((xuno - xdos), 2) + Math.pow((yuno - ydos), 2));
          pDos = Math.sqrt(Math.pow((xdos -xtres), 2) + Math.pow((ydos - ytres), 2));
          pTres = Math.sqrt(Math.pow((xtres - xuno), 2) + Math.pow(ytres - yuno, 2));
          
          iPerimetro = pUno + pDos + pTres;
          
          System.out.println("El perímetro es: " + iPerimetro);
    }
    
}
