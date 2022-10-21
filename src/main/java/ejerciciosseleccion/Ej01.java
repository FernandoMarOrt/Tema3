package ejerciciosseleccion;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
        
        //Los resultados son:
        // 15 es menor de edad
        // 18 es mayor de edad
        // 60 es mayor de edad
    }

}
