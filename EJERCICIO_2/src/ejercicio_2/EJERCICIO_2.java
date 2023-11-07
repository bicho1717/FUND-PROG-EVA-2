/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el primer número entero:");
        num1 = input.nextInt();
        System.out.println("Introduce el segundo número entero:");
        num2 = input.nextInt();
        
        for(int i = num1; i <= num2; i++){
            if((i % 2) != 0)
                continue;
            System.out.print(i + " - "); 
        }
    }
    
}
