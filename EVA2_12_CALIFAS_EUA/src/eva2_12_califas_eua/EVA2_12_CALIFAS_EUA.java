/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificación");
        califa = input.nextInt();
        
        if ((califa >= 90) && (califa <= 100))
        System.out.println("La calificacion es:"  + " A");
        
        else if((califa >= 80) && (califa <= 89))
            System.out.println("La calificacion es:" + "B");
        else if((califa >= 70) && (califa <= 79))
            System.out.println("La calificacion es:" + "C");
        else if((califa >= 60) && (califa <= 69))
            System.out.println("La calificacion es:" + "D");
        else if((califa < 60)&& (califa >= 0))
            System.out.println("La calificacion es:" + "F");
       
        else 
            System.out.println("La calificacion no es valida:" );
    }
}
