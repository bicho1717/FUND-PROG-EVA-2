/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String caracter;

        do {
            System.out.println("Introduce un caracter alfabético:");
            caracter = input.nextLine();

            switch (caracter) {
                case "a":
                    System.out.println("Es una palabara vocal.");
                    break;
                case "e":
                    System.out.println("Es una palabara vocal.");
                    break;
                case "i":
                    System.out.println("Es una palabara vocal.");
                    break;
                case "o":
                    System.out.println("Es una palabara vocal.");
                    break;
                case "u":
                    System.out.println("Es una palabara vocal.");
                    break;
                default:
                    if (!caracter.isEmpty()) {
                        System.out.println("Es una palabra consonante.");
                    }
            }
        } while (!caracter.equals(""));
        System.out.println("El programa terminó debido al espacio en blanco.");
    }
}
