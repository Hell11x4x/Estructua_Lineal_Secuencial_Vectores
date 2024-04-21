/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Modalidad_Pago {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double costo;
        
        System.out.println("Ingrese el costo del producto a comprar: ");
        costo = tecla.nextDouble();
        
        if (costo >= 200){
            System.out.println("Se paga en efectivo");
        
        } else {
            System.out.println("Se paga con tarjeta");
        
        }
    
    }
    
}
