/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Grupo_Apertura {
    public static void main (String [] args){
        Scanner tecla = new Scanner (System.in);
        
        String nomgrupo;
        int numalumno;
        
        System.out.println("Ingrese un nombre para su grupo: ");
        nomgrupo = tecla.nextLine();
        System.out.println("Ingrese el número de alumnos preinscritos: ");
        numalumno = tecla.nextInt();
        
        if (numalumno >= 30) {
            System.out.println("Nombre del grupo: " + nomgrupo);
            System.out.println("Alumnos inscritos: " + numalumno);
            System.out.println("Grupo: Abierto");
           
        } else {
            System.out.println("Nombre del grupo: " + nomgrupo);
            System.out.println("Alumnos inscritos: " + numalumno);
            System.out.println("Grupo: Cerrado");
        
        }
    
    }
    
}
