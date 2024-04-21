/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Promedio_Nota {
    public static void main (String [] args) {
        Scanner tecla = new Scanner (System.in);
        
        String matricula;
        double caliuno, calidos, calitres, calicuatro, calicinco, cPromedio;
        
        System.out.println("Ingrese la matrícula del alumno: ");
        matricula = tecla.nextLine();
        System.out.println("Ingrese la 1° calificación: ");
        caliuno = tecla.nextDouble();
        System.out.println("Ingrese la 2° calificación: ");
        calidos = tecla.nextDouble();
        System.out.println("Ingrese la 3° calificación: ");
        calitres = tecla.nextDouble();
        System.out.println("Ingrese la 4° calificación: ");
        calicuatro = tecla.nextDouble();
        System.out.println("Ingrese la 5° calificación: ");
        calicinco = tecla.nextDouble();
        
        cPromedio = (caliuno + calidos + calitres + calicuatro + calicinco) / 5;
        
        if (cPromedio >= 6) {
            System.out.println("Matícula: " + matricula);
            System.out.println("Premedio: " + cPromedio);
            System.out.println("Condición: Aprobado");
        
        } else {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Promedio: " + cPromedio);
            System.out.println("Condición: No aprobado");
        
        }
    
    }
    
}
