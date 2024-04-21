/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Lavar_Platos {
    public static void main (String [] args){
        Scanner tecla = new Scanner(System.in);
        
        String plato;
        
        System.out.println("Cómo se encuentra el plato: ");
        System.out.println("Sucio o limpio");
        plato = tecla.nextLine();
        
        if (plato.equals("sucio")){
            System.out.println("Enjabonar el plato");
            System.out.println("Sobar el plato");
            System.out.println("Enjuagar el plato");
            System.out.println("Secar el plato");
            System.out.println("Guardar el plato");
        
        }
        if (plato.equals("limpio")){
            System.out.println("NO se necesita lavar el plato");
        
        }
            
    
    }
    
}
