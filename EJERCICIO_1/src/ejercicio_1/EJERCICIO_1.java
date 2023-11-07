/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduce el primer número entero:");
        num1 = input.nextInt();
        System.out.println("Introduce el segundo número entero:");
        num2 = input.nextInt();
        
        for (int i = num1; i <= num2; i++){
            
            System.out.print(i + "-" );
        }
    }
    
}
