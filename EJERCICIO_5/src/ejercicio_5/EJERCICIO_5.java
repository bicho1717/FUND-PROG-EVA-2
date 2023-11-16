/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int base;
        int exp;
        int potencia = 1;

        System.out.println("Introduce el numero de la base:");
        base = input.nextInt();

        System.out.println("Introduce el exponente:");
        exp = input.nextInt();
        /////////////////////////////////////////////
        for (int i = 1; i <= exp; i++) {
            potencia = (potencia * base);
        }

        System.out.println("La potencia de la base elevada al exponente es:" + potencia);
    }
}
