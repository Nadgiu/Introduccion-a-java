/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia1;

import java.util.Scanner;

/**
 *
 * @author Nadia Giuliana
 */
public class Ejercicio_4 {

    /**Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // importamos la funcion Scanner para que lea los grados ingresados por
        // teclado
        
        Scanner leer = new Scanner(System.in);
        
        // pedimos que ingrese los grados por teclado:
        
        System.out.println(" Ingrese los grados que desea convertir a su equivalente "
                + " en grados Fahrenheit.");
        
        // guardo los grados ingresados en la variable grados (decimal)
        int grados = leer.nextInt();
        
        // IMPRIMO EL TEXTO CON LOS GRADOS CONVERTIDOS
         double resultado =  (32 + (9* grados /5 ));
        System.out.println(" Los grados Fahrenheit equivalentes a los grados ingresados"
                + "son;" + resultado );
        
       
        
        
    }
    
}
