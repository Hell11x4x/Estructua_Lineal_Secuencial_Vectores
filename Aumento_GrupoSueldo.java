/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class Aumento_GrupoSueldo {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        double calculoAumentoDeSueldo, nomina;
        int empleado, sueldo, i;
        
        calculoAumentoDeSueldo = 0;
        nomina = 0;
        i = 1;
        
        System.out.println("Cuantos empleados son en tu grupo?");
        empleado = teclado.nextInt();
        
        while (i <= empleado) {
            System.out.println("Ingrese sueldo del empleado: " + i);
            sueldo = teclado.nextInt();
            
            if (sueldo <= 999) {
                calculoAumentoDeSueldo = sueldo * 1.15;
                System.out.println("El nuevo sueldo del trabajor: " + i + " es: S/." + calculoAumentoDeSueldo);
            } else {
                calculoAumentoDeSueldo = sueldo * 1.12;
                System.out.println("El nuevo sueldo del empleado: " + i + " es: S/." + calculoAumentoDeSueldo);
            }  
            
            i = i + 1;
            nomina = nomina + calculoAumentoDeSueldo;
        }
        
        System.out.println("La nómina es de: S/." + nomina);
    }
}
