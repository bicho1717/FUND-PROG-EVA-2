/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int suma;
        suma = 0;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce un número: ");
        num = input.nextInt();
        
        for (int i = 0; i <= num; i++){
            
            System.out.print(i + " + " );
            suma = suma + i ;
        }
        
        System.out.println("");
        System.out.println("La suma de todos los numero es:"  + suma );
    }
    
}
