/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchRandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Switchrandom2 {
    
    public static void main(String[] args) {
        
        //Si el usuario introduce A , B o C se debe guardar un aleatorio
        //entre 1 y 10 
        
        //Si introduce D , guardar aleatorio entre 11 y 25 
        
        //Si introduce E, aleatorio entre 26 y 33
        
        //En otro caso , aleatorio entre 34 y 100
        
        //Creo un objeto de tipo Random llamo generador
        Random generador = new Random();
        
        Scanner teclado = new Scanner(System.in);
        
        int numAleatorio;
        numAleatorio = generador.nextInt(); 
        
//        //El numero nunca sale 10 
//        numAleatorio = generador.nextInt(10); 
//        
//        //El numero aleatorio entre 1 y 19
//        numAleatorio = generador.nextInt(19)+1;
//        
//        System.out.println("El numero es " + numAleatorio);
//        
//        //Generar en un rango dado 12 - 18
//        
//        // nextInt(Mayor - Menor + 1)
//        
//        numAleatorio = generador.nextInt(7)+12;
        
        System.out.println("Introduce una letra A , B , C , D , E");
        
        String letraString = teclado.nextLine();
        
        switch (letraString) {
            case "A" , "B" , "C":
                //Entre 1 y 10
                numAleatorio = generador.nextInt(10)+1;
                break;
            case "D":
                //Entre 11 y 25
                numAleatorio = generador.nextInt(15)+11; //EL quince seria el grande menos el chico mas 1 es decir 25-11+1
                break;
            case "E":
                //Entre 26 y 33
                numAleatorio = generador.nextInt(8)+26;
                break;
            default:
                //Entre 34 y 100
                numAleatorio = generador.nextInt(67)+34;
        }
        
        System.out.println("El numero generado es " + numAleatorio);
    }
    
}
