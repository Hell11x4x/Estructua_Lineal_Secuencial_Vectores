/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Cambio_Carrera {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        String matricula, carrera;
        int semestre, cambio;
        double promedio;
        
        System.out.println("Ingrese matrícula del alumno: ");
        matricula = teclado.nextLine();
        System.out.println("Ingrese carrera del alumno: ");
        carrera = teclado.nextLine();
        System.out.println("Ingrese semestre: ");
        semestre = teclado.nextInt();
        System.out.println("Carreras disponibles");
        System.out.println("Enfermería (1)");
        System.out.println("Psicología (2)");
        System.out.println("Derecho (3)");
        System.out.print("Elige su opción: ");
        cambio = teclado.nextInt();
        
        if(cambio == 1){
            System.out.println("Ingrese promedio");
            promedio = teclado.nextDouble();
            if(promedio > 10) {
                System.out.println("Apto para cambiarse a Enfermería");
            } else {
                System.out.println("No es apto");
            }
        } else {
            if(cambio == 2) {
                System.out.println("Ingrese promedio: ");
                promedio = teclado.nextDouble();
                if (promedio >= 11) {
                    System.out.println("Apto para cambiarse a Psicología");
                } else {
                    System.out.println("No es apto");
                }
            } else {
                if(cambio == 3){
                    System.out.println("Ingrese promedio: ");
                    promedio = teclado.nextDouble();
                    if (promedio > 10){
                        System.out.println("Apto para cambiarse a Derecho");
                    } else {
                        System.out.println("No es apto");
                    }
                }
            }
        }        
    }
}
