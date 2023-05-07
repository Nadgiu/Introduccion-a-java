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
public class Ejercicio_3 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
     * @param args
     */
    public static void main(String[] args) {
       
       // Importamos la funcion scaneer //
       Scanner leer = new Scanner(System.in);
       System.out.println(" Ingrese una frase:");
       
       String frase = leer.nextLine();
       
       System.out.println(" La frase ingresada en mayuscula es : " + frase.toUpperCase());
       
       System.out.println(" La frase ingresada en mincuscula es : " + frase.toLowerCase());
    }
    
}
