/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES--> SIMBOLO QUE EJECUTA ALGUNA ACCCIÓN
        //SUMA 
        int suma,val1,val2;
        val1 = 100;
        val2 = 200;
        
        suma = val1 + val2; // SUMA ARITMÉTICA
        System.out.println("SUMA-----------"); 
        System.out.println("La suma es = " + suma); //CONCATENACIÓN
        
        
        int resta;
        resta = val1 - val2; 
        System.out.println("RESTA-----------"); 
        System.out.println("La resta es = " + resta);
        
        
        int multi;
        multi = val1 * val2;
        System.out.println("MULTIPLICACION-----------"); 
        System.out.println("La multiplicacion es = " + multi);
        
        int divi;
        divi = val1 / val2;
        System.out.println("DIVISON-----------"); 
        System.out.println("La division es = " + divi);
        
        val1 = 11;
        val2 = 2;
        double resu;
        resu = val1 / val2;
        System.out.println("La division 11/2" + resu);
        int residuo = val1 & val2;
        System.out.println("El residuo de 11/2 es:" + residuo);
        //.........
        System.out.println("La division 11/2" + resu);
        double val2Double = 2;
        resu  = val1 / val2Double;
        System.out.println("La division 11/2 es:" + resu);
        
        
        
        // POTENCIAS
        double potencia = Math.pow(3, 3);
        System.out.println("POTENCIA----------");
        System.out.println("3 elevado a la 3 = " + potencia);
        
        
        double raiz = Math.pow(100, 0.5);
        System.out.println("RAIZ----------");
        System.out.println("La raiz cuadrada de 100 es: = " + raiz);
        
        // Precedencia de operadores 
        int resuOp, x =3, y = 2, z = 5;
        resuOp = (x*z) + (x*y) / 2 - (y- z);
        System.out.println("El resultado es: = " + resuOp);
        
        //FORMULA GENERAL
        double resuForm, a = 3, b = 9, c = 3;
        resuForm = ((-b)- Math.pow((b*b  - 4 * a * c), 0.5))/(2*a);
        System.out.println("El resultado es:" + resuForm);
        
        
        
        
        
        
        
        
    }
    
}
