/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner input = new Scanner(System.in);
        String texto;
        int contador = 0;
        char caracter;

        System.out.println("Introduce la cadena de texto:");
        texto = input.nextLine();
        System.out.println("Introduce el caracter que deseas:");
        caracter = input.next().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador = contador + 1;
            }
        }
        System.out.println("La cantidad de veces que se repite el caracter en nuestra cadena es de: " + "[" + contador + "]" );

    }

}
