/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Costo_Total {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        int tipo, costo, edad, dias;
        double costoTotal;
        
        System.out.println("Tafira de costo por tipo de enfermedad específicos");
        System.out.println("(1) 25 soles por día");
        System.out.println("(2) 16 soles por día");
        System.out.println("(3) 20 soles por día");
        System.out.println("(4) 30 soles por día");
        tipo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese nombre del paciente: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese edad del paciente: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese días de estancia del paciente: ");
        dias = teclado.nextInt();
        
        if (tipo >= 1 && tipo <= 4) {
            
            switch (tipo) {
            case 1:
                costo = 25 * dias;
                break;
            case 2:
                costo = 26 * dias;
                break;
            case 3:
                costo = 20 * dias;
                break;
            case 4:
                costo = 30 * dias;
                break;
            default:
                costo = 0;
            } 
            
            if (edad >= 14 && edad <= 22) {
                costoTotal = costo * 1.10;
            } else {
                costoTotal = costo;
            }
            
            System.out.println("Nombre: " + nombre);
            System.out.println("El costo total sería de: S/." + costoTotal);
            
        } else {
            
            System.out.println("El tipo de enfermedad que selecionanste no tiene costo");
        } 
    }
}
