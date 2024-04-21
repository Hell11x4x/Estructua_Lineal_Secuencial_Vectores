    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    import java.util.Scanner;
    /**
     *
     * @author Hell
     */
    public class Aumento_Sueldo4 {
        public static void main (String [] args){

            Scanner teclado = new Scanner(System.in);
            double sueldo, aumento, total, totalGrupo;
            int trabajadores;

            System.out.println("Cúantos trabajadores hay en ese grupo?: ");
            trabajadores = teclado.nextInt();
            System.out.println("Ingrese el sueldo de los trabajadores: ");
            sueldo = teclado.nextDouble();

            if (sueldo < 1000) {
                aumento = sueldo * 0.15;
                total = sueldo + aumento;
                totalGrupo = total * trabajadores;
                System.out.println("El nuevo sueldo de los trabajadores es: ");
                System.out.println(total);
                System.out.println("Nómina");
                System.out.println(trabajadores + " trabajadores x " + total + "nuevo sueldo = " + totalGrupo);
            } else {
                if (sueldo >= 1000) {
                    aumento = sueldo * 0.12;
                    total = sueldo + aumento;
                    totalGrupo = total * trabajadores;
                    System.out.println("El nuevo sueldo de los trabajadores es: " + total);
                    System.out.println("-----------------Nómina-------------------");
                    System.out.println( trabajadores + " trabajadores x " + total + " nuevo sueldo = " + totalGrupo);
                }
            }
        }
    }
