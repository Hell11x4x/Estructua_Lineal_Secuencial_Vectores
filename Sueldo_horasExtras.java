/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Sueldo_horasExtras {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        double sueldoTotal;
        int sueldo, horasExtras, categoria ;
        
        System.out.println("Seleccione una su opción preferida: ");
        System.out.println("(1) 30 soles por hora extra");
        System.out.println("(2) 38 soles por hora extra");
        System.out.println("(3) 50 soles por hora extra");
        System.out.println("(4) 70 soles por hora extra");
        categoria = teclado.nextInt();
        System.out.println("Ingrese su sueldo recibido");
        sueldo = teclado.nextInt();
        System.out.println("Ingrese sus horas extras trabjadas");
        horasExtras = teclado.nextInt();
        
        switch (categoria) {
            case 1:
                sueldoTotal = sueldo + (30 * horasExtras);
                break;
            case 2:
                sueldoTotal = sueldo + (38 * horasExtras);
                break;
            case 3:
                sueldoTotal = sueldo + (50 * horasExtras);
                break;
            case 4:
                sueldoTotal = sueldo + (70 + horasExtras);
                break;
            default:
                sueldoTotal = sueldo;
                break;
        }
        
        System.out.println("Sueldo total incluido horas extras es de: S/." + sueldoTotal);
    }
}
