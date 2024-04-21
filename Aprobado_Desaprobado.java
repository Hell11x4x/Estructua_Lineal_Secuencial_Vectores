/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Aprobado_Desaprobado {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Ingrese nota del alumno: ");
        nota = tecla.nextDouble();
        
        if(nota > 10){
            System.out.println("El alumno está aprobado");
        
        }else{
            System.out.println("El alumno está desaprobado");
        
        }
    
    }
    
}
