/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Llamadas_Internacionales {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        int clave, minutos;
        double costoTotal;
        
        System.out.println("---------TARIFA----------");
        System.out.println("(12) América Norte 2/min");
        System.out.println("(15) América Cnetral 2.2/min");
        System.out.println("(18) América Sur 4.5/min");
        System.out.println("(19) Europa 3.5/min");
        System.out.println("(23) Asia 6/min");
        System.out.println("(25) África 6/min");
        System.out.println("(29) Oceania 5/min");
        System.out.print("Marque una clave: ");
        clave = teclado.nextInt();
        System.out.println("Ingrese minutos hablados: ");
        minutos = teclado.nextInt();
        
        switch (clave) {
            case 12:
                costoTotal = 2 * minutos;
                break;
            case 15:
                costoTotal = 2.2 * minutos;
                break;
            case 18:
                costoTotal = 4.5 * minutos;
                break;
            case 19: 
                costoTotal = 3.5 * minutos;
                break;
            case 23:
                costoTotal = 6 * minutos;
                break;
            case 25: 
                costoTotal = 6 * minutos;
                break;
            case 29:
                costoTotal = 5 * minutos;
                break;
            default:
                costoTotal = 0;
        }
        
        System.out.println("Costo total de la llamada es: " + costoTotal);
    }
}
