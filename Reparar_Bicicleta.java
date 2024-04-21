/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Reparar_Bicicleta {
    public static void main (String [] args) {
        Scanner tecla = new Scanner(System.in);
        
        String llanta;
        
        System.out.println("La llanta de la bicicleta presenta un pinchazo");
        System.out.println("Si o No?");
        llanta = tecla.nextLine();
        
        //".equals" sirve para verificar la igualdad de caligrafía para ser verdadero
        //".equalsIgnoreCase" no distigue entre mayúscula o minuscula solo ve si la palabra coincide con lo escrito
        
        if (llanta.equalsIgnoreCase("Si")){
            System.out.println("Desmontar la llanta de la bicicleta");
            System.out.println("Ubicar los pinchazos posibles");
            System.out.println("Reparar los pinchazos");
            System.out.println("Montor la llanta en la bicicleta");
            System.out.println("Todo listo");
        
        }
        if (llanta.equals("No")){
            System.out.println("No hay nada que reparar");
        
        }
    
    }
    
}
