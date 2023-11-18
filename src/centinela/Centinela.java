/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centinela;

import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class Centinela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //primero poder ingresar palabras por pantalla
        /*Scanner dataEntrante = new Scanner(System.in);
        
        boolean salir = false;
        //mostrar por pantalla las palabras ingresadas
        System.out.println("ingresar palabra");
        /*while (salir == false) {            
            
            if (!"salir".equals(palabra)) {
                System.out.println(palabra);
            } 
            else {
                salir = true;
            }
        }*/
        /*String palabra = ""; 
         while (!palabra.equals("salir")) {
             palabra = dataEntrante.nextLine();
             System.out.println("la palabra es: " + palabra);
        }
        */
        //
        /*
        Scanner dataEntrante1 = new Scanner(System.in);
        Scanner dataEntrante2 = new Scanner(System.in);
        String dni = "";
        String nombre = "";
        int edad;
        System.out.println("incripciones");
        while (!dni.equals("0") || !nombre.equals("fin")) {
            System.out.println("dni:");
            dni = dataEntrante1.nextLine();
            
            System.out.println("nombre:");
            nombre = dataEntrante1.nextLine();
            
            System.out.println("edad: ");
            edad = dataEntrante2.nextInt();
            
            if (edad <= 10 && edad >= 6) {
                System.out.println("cat : menores A");
            } else if (edad <= 17 && edad >= 11){
                System.out.println("cat : menores B");
            } else if (edad <= 30 && edad >= 18) {
                System.out.println("cat : juveniles");
            } else if (edad <= 50 && edad >= 31) {
                System.out.println("cat : adultos");
            } else if (edad >= 50) {
                System.out.println("cat : Adultos mayores");
            } else {
                System.out.println("no tiene suficinete edad para la operacion");
            }
            //System.out.println("dni: " + dni);
            //System.out.println("nombre: " + nombre);
            
        }*/
        /*Scanner dataEntrante = new Scanner(System.in);
        
        String[] nombre = new String[8];
        System.out.println("Escriba las palabras:");
        //carga
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("la palabra numero " + (i+1) + " es : ");
            nombre[i] = dataEntrante.nextLine();
            
            
        }
        //recorrido
        System.out.println("las palabras ingresadas son: ");
        for (String nombre1 : nombre) {
            System.out.println(nombre1);
        }*/
        /*
        Scanner dataEntrante = new Scanner(System.in);
        Scanner dataEntrante2 = new Scanner(System.in);
        String[] ciudad = new String[5];
        int[]   gradMin = new int[5];
        int[]   gradMax = new int[5];
        
        int min = 100;
        int max = 0;
        int here = 0;
        int here2 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("ciudad:");
            ciudad[i] = dataEntrante.nextLine();
            System.out.println("grados min:");
            gradMin[i] = dataEntrante2.nextInt();
            System.out.println("grados max");
            gradMax[i] = dataEntrante2.nextInt();
            
            if (gradMin[i] < min) {
                min = gradMin[i];
                here = i;
            }
            
            if (gradMax[i] > max) {
                max = gradMax[i];
                here2  = i;
            }
        }
        System.out.println("l ciudad con temp mas bajo es: " + ciudad[here] + " con: " + gradMin[here] + " grados.");
        System.out.println("la ciudad con temp mas alto es : " + ciudad[here2] + " con: " + gradMax[here2] + " grados.");
        
        */
        
        
    }
    
}
