/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Compras_Descuentos {
    public static void main (String[]args){
    
        Scanner teclado = new Scanner(System.in);
        double montodeCompra, descuento, calculodeDescuento, compraconDescuento;
        
        System.out.println("Ingrese monto de su compra: ");
        montodeCompra = teclado.nextDouble();
        
        if (montodeCompra < 500) {
            descuento = 0.00;
            calculodeDescuento = montodeCompra * descuento;
            compraconDescuento = montodeCompra - calculodeDescuento;
            
            System.out.println("Su compra tiene un descuento del: 0%");
            System.out.println("Descuento de su compra: " + calculodeDescuento);
            System.out.println("total a pagar: " + compraconDescuento);
        } else {
            if(montodeCompra >= 500 && montodeCompra < 1000) {
                descuento = 0.05;
                calculodeDescuento = montodeCompra * descuento;
                compraconDescuento = montodeCompra - calculodeDescuento;
                
                System.out.println("Su compra tiene un descuento del: 5%");
                System.out.println("Descuento de su compra: " + calculodeDescuento);
                System.out.println("Total a pagar: " + compraconDescuento);
            } else {
                if (montodeCompra >= 1000 && montodeCompra < 7000){
                    descuento = 0.11;
                    calculodeDescuento = montodeCompra * descuento;
                    compraconDescuento = montodeCompra - calculodeDescuento;
                    
                    System.out.println("Su compra tiene un descuento del: 11%");
                    System.out.println("Descuento de su compra: " + calculodeDescuento);
                    System.out.println("Total a pagar: " + compraconDescuento);
                } else {
                    if (montodeCompra >= 7000 && montodeCompra <= 15000) {
                        descuento = 0.18;
                        calculodeDescuento = montodeCompra * descuento;
                        compraconDescuento = montodeCompra - calculodeDescuento;
                        
                        System.out.println("Su compra tiene un descuento del: 18%");
                        System.out.println("Descuento de su compra: " + calculodeDescuento);
                        System.out.println("Total a pagar: " + compraconDescuento);
                    } else {
                        descuento = 0.25;
                        calculodeDescuento = montodeCompra * descuento;
                        compraconDescuento = montodeCompra - calculodeDescuento;
                        
                        System.out.println("Su compra tiene un descuento del: 25%");
                        System.out.println("Decuento de su compra: " + calculodeDescuento);
                        System.out.println("Total a pagar: " + compraconDescuento);
                    }
                }
            }
        }    
    }  
}
