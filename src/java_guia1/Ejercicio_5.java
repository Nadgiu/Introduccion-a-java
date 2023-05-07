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
public class Ejercicio_5 {

    /**Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // importamos la funcion de scanner 
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un numero entero");
        
        int numero = leer.nextInt();
        
        int doble = numero *2;
        int triple = numero *3;
        double raiz = Math.sqrt(numero);
        
        System.out.println("El doble del numero " + numero + " es: " + doble );
        System.out.println("El triple del numero " + numero + " es: " + triple );
        System.out.println("La raiz del numero" + numero + " es: " + raiz );
    }
    
}
