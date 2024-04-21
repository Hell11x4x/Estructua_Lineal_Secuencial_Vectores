/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hell
 */
public class parEImpar {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner(System.in);
        int condicion, i;
        
        condicion = 1;
        i = 0;
        
        while (i < 50) {
            System.out.println(condicion);
            condicion = condicion + 2;
            i = i + 1;
        }
    }
}
