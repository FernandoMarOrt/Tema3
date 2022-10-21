package ejemplosclase;

import java.util.Scanner;

public class EJEMPLO01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.nextLine();

        System.out.println("Introduce la letra a buscar");
        String letraBuscar = teclado.nextLine();

        //Si la letra esta contenida en el nombre 
        //mostar el numero de caracteres que tiene el nombre y la posicion
        //donde esta la letra 
        //en otro caso , mostar si el numero de letras del nombre es par o impar
        boolean letraContenida = nombre.contains(letraBuscar);

        if (letraContenida == true) {

        }

        //Si la variable nombre tiene la letra que buscamos 
        //la sentencia se realiza
        //VERSION 2
        if (nombre.contains(letraBuscar)) {

            //Es mas funcional que if (nombre.contains(letraBuscar) == true)
            //Tamaño de la cadena 
            System.out.println("El numero de caracteres es " + nombre.length());

            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion de la letra " + letraBuscar + " es " + (posicion + 1));
            //Posicion donde esta la letra

        } else if (nombre.length() % 2 == 0) { //Si el numero de letras del string es par 

            System.out.println("El numero de caracteres es par");

        } else {

            System.out.println("EL numero de caracteres es impar");
        }

        //version 3
        if (nombre.contains(letraBuscar)) {

            //Es mas funcional que if (nombre.contains(letraBuscar) == true)
            //Tamaño de la cadena 
            System.out.println("El numero de caracteres es " + nombre.length());

            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion de la letra " + letraBuscar + " es " + (posicion + 1));
            //Posicion donde esta la letra

        } else {

            String textoResultado = (nombre.length() % 2 == 0)?
                     "El numero de caracteres es par":
                     "El numero de caracteres es impar";
                        System.out.println(textoResultado);
        }

    }

}
