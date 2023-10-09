/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here}
      int califa;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Introduce tu calificacion");
      califa = input.nextInt();
      
      if (califa >= 70){ //If (expresion a evaluar
         //ESTE BLOQUE SIEMPRE ES UNA VERDAD
         //LAS LLAVES SE USAN CUANDO SON MAS DE UNA INSTRUCCION
         //DENTRO DEL IF. SI ES UNA SOLA, NO SE USAN
         System.out.println("Aprobado: viaje a cancún!!");
         System.out.println("Felicidades!!");
      }else //else ==>si no.Es opcional
         //ESTE BLOQUE SIEMPRE ES FALSO
         System.out.println("NO ACREDITADO: A PICAR PIEDRA");
      
      System.out.println("FIN DEL PROGRAMA");
   }
}
