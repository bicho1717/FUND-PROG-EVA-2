/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        int residuo;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor a evaluar:");
        valor = input.nextInt();
        
        residuo = valor & 2; //Módulo; calcula el residuo
        
        if (residuo == 0)
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar");
        
    }
    
}
