/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_ciclo_for;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // for --> desde (punto de inicio hacia otro)
        // ++ le suman uno a la variable
        // -- le resta uno a la variable
        // += le aumnetan N a la varibale
        // 
        for (int i = 0; i < 10; i++) { // ++ le suman uno a la variable
            System.out.println(i);

        }
        System.out.println("-------------------------");
        
        for(int i = 9; i>= 0; i--){
            System.out.println(i);
        }
            
           
        
        System.out.println("------------------------");
         // NUMEROS PARES DE 0 A 100
         for (int i = 0; i <= 100; i +=2)
             System.out.print(i + " - ");

    }

}
