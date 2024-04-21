/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hell
 */
public class Tabla_UnoNuece {
    public static void main (String [] args){
        
        for (int tabla = 1; tabla <= 9; tabla ++) {
            for (int numero = 1; numero <= 12; numero ++) {
                double resultado = tabla * numero;
                System.out.println(tabla + " X " + numero + " = " + resultado);
            }
        }
    }
}
