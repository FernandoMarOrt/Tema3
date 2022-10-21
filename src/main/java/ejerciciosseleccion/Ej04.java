package ejerciciosseleccion;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");
        int edad = scanner.nextInt();
        
        //Evalua si la edad es mayor o igual que 18
        String resultado = (edad >= 18)
                ? "Es mayor de edad" //Si es mayor de edad lo imprime por pantalla
                : "Es menor de edad"; //Si no imprime que es menor de edad
        System.out.println(resultado);

    }

}
