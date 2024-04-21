/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Descuento_Comptra {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        
        double monto, mDescuento, mcDescuento;
        
        System.out.println("Ingrese el monto de sus compra");
        monto = tecla.nextDouble();
        
        if (monto >= 100){
            mDescuento = monto * 0.10;
            mcDescuento = monto - mDescuento;
            
        } else {
            mDescuento = monto * 0.02;
            mcDescuento = monto - mDescuento;
            
        }
        
        System.out.println("Su descuento es: " + mDescuento);
        System.out.println("El monto a pagar con descuento incluido es: " + mcDescuento);
        
    }
    
}
