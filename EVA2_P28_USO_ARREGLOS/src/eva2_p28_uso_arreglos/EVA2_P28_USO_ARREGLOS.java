/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class EVA2_P28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int [] califas;
        Scanner input = new Scanner (System.in);
        System.out.println("Cantidad de calificaciones que quieren capturar:");
        cant = input.nextInt();
        califas = new int [cant];
        
        for(int i = 0; i < cant; i++){
            System.out.println("Introduce la calificacion:");
            califas[i] = input.nextInt();
        }
        for(int i = 0; i < cant; i++){
            System.out.println("[" + califas[i] + "]");
            
        }
    }
    
}
