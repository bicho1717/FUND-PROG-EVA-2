/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numero;
        int numeroM = 0;
        int numerom = 0;

        do {
            System.out.print("Introduce un numero entero: ");
            numero = input.nextInt();

            if (numero >= 0) {
                if (numero < numerom || numerom == 0) {
                    numerom = numero;
                }
                if (numero > numeroM || numeroM == 0) {
                    numeroM = numero;
                }
            }

        } while (numero >= 0);

        if (numeroM != 0) {
            System.out.println("El número más pequeño es: " + numerom);
            System.out.println("El número más grande es: " + numeroM);
        } 

    }

}
