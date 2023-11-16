/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero entero para convertirlo a binario:");
        numero = input.nextInt();

        if (numero < 0) {
            System.out.println("No es un número entero positivo");
        } 
        else{
            String numero_Binario = Integer.toBinaryString(numero);
            System.out.println("El equivalente en sistema binario es: " + numero_Binario);
        }
    }

}
