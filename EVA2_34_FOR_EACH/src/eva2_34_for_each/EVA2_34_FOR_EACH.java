/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_34_for_each;

/**
 *
 * @author invitado
 */
public class EVA2_34_FOR_EACH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //For each--> para recorrerr arreglos
      //solo sirve para leer arreglos
      int arreglo[] = new int[10];
      for (int i = 0; i < arreglo.length; i++) {
         arreglo[i] = (int)(Math.random() * 100);
      }
      for (int valor : arreglo) {
         System.out.print("[" + valor + "]");
      }
      System.out.print("");
      String mensaje [] = {"Hola"," ","mundo"," ","cruel!!"};
      for (String valor : mensaje) {
         System.out.print(valor);
      }
   }   
}
