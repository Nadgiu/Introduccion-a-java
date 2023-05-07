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
public class Java_Guia1 {

    /**Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma **/
    public static void main(String[] args) {
        // ESCRIBO UN MSJ PARA QUE INGRESEN LOS NUMEROS POR TECLADO
       
       System.out.println(" Ingrese dos numeros enteros.");
       Scanner leer = new Scanner(System.in);
       
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       
       int suma = num1 + num2;
       
       System.out.println(" El resultado de la suma es :" + suma);
    }
    
}
