/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una cadena:");
        String cadena = input.nextLine();  
        
        String [] numeros= new String [10];
        numeros[0] = "0";
        numeros[1] = "1";
        numeros[2] = "2";
        numeros[3] = "3";
        numeros[4] = "4";
        numeros[5] = "5";
        numeros[6] = "6";
        numeros[7] = "7";
        numeros[8] = "8";
        numeros[9] = "9";

        for (String numero : numeros) {
            if (cadena.equals(numero)) {
                System.out.println("La cadena de texto [si] representa un número válido. ");
                return;
            }
        }
        System.out.println("La cadena de texto [no] representa un número válido");
        return;
    }
    
} 
