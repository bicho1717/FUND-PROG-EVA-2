/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carrera;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce la inicial de tu carrera:");
        carrera = input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("INGENERIA EN SISTEMAS COMPUTACIONALES");
                break; //Termina la ejecucion
            case "ARQ":
                System.out.println("ARQUITECTURA");
                break; //Termina la ejecucion
            case "IINF":
                System.out.println("INGENERIA EN INFORMATICA");
                break; //Termina la ejecucion
            case "II":
                System.out.println("INGENERIA INDUSTRIAL");
                break; //Termina la ejecucion
            case "IDI":
                System.out.println("INGENERIA EN DISEÑO INDUSTRIAL");
                break; //Termina la ejecucion
            case "LA":
                System.out.println("LICENCIATURA EN ADMINISTRACION");
                break; //Termina la ejecucion
            case "IGE":
                System.out.println("INGENERIA EN GESTION EMPRESARIAL");
                break; //Termina la ejecucion
            default:
                System.out.println("NO EXISTE CARRERA CON ESAS INICIALES" + carrera);
            
            
        }
    }
    
}
