/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numero;
        String terminar;
        
        do{ //do-while es aquella que se repite mientras que se cumple una determinada condición. 
        System.out.println("Ingrese un numero para saber si es positivo,negativo o cero:");
        numero = input.nextInt();
        
        if (numero == 0)
            System.out.println("El numero " +"["+ numero +"]"+" es cero");
        else if (numero < 0)
            System.out.println("El numero " +"["+ numero +"]"+" es negativo");
        else{
            System.out.println("El numero " +"["+ numero +"]"+" es positivo");
            
        }
        
        System.out.println("¿Desea terminar con el programa?");
        terminar = input.next();
            
        }while (terminar.equals("no"));
        
        System.out.println("Fin del programa");
        
        
    }
    
}
