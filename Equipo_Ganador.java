/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Equipo_Ganador {
    public static void main (String [] args ) {
        Scanner tecla = new Scanner(System.in);
        
        String equipo1, equipo2;
        int gol1, gol2, penal1, penal2;
        
        System.out.println("Ingrese nombre del equipo: ");
        equipo1 = tecla.nextLine();
        System.out.println("Ingrese goles anotados: ");
        gol1 = tecla.nextInt();
        tecla.nextLine();

        System.out.println("Ingrese nombre del equipo: ");
        equipo2 = tecla.nextLine();
        System.out.println("Ingrese goles anotados: ");
        gol2 = tecla.nextInt();
        tecla.nextLine();
        
        
        if(gol1 == gol2){
            System.out.println("Empate. SE VAN A PENALES");
            System.out.println("Ingrese goles anotados en penales del equipo: " + equipo1);
            penal1 = tecla.nextInt();
            System.out.println("Ingrese goles anotados en penales del equipo: " + equipo2);
            penal2 = tecla.nextInt();
            
            if(penal1 > penal2){
                System.out.println("EQUIPO GANADOR");
                System.out.println(equipo1);
                System.out.println(gol1 + penal1);
            
            } else {
                System.out.println("EQUIPO GANADOR");
                System.out.println(equipo2);
                System.out.println(gol2 + penal2);
            
            }
        
        } else {
            if (gol1 > gol2){
                System.out.println("EQUIPO GANADOR");
                System.out.println(equipo1);
                System.out.println(gol1);
            
            } else {
                System.out.println("EQUIPO GANADOR");
                System.out.println(equipo2);
                System.out.println(gol2);
            
            }
        
        }
        
    
    }
    
}
