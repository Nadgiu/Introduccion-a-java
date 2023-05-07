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
public class Ejercicio_2 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
     * @param args
     */
    public static void main(String[] args) {
      
        // INVOCO E IMPORTO LA FUNCION SCANNER 
        
        Scanner leer = new Scanner(System.in);
        
        // Genero un msj por pantalla que pida mi nombre //
        System.out.println(" Ingresa tu nombre:");
        
        String nombre = leer.next();
        
        System.out.println(" Tu nombre es :" + nombre);
    }
    
}
