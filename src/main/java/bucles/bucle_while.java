package bucles;

import java.util.Scanner;

public class bucle_while {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero (100-200)");
        int num = teclado.nextInt();
        //Volver a pedir al usuario el numero si no esta entre 100 y 200
        
        
        while(num<100 || num>200) {
            
            System.out.println("Te has equivocado por favor introduce de nuevo");
            num = teclado.nextInt();
            
        }
        
        
        
        
        

        //Inicializacion de la variable de control
        int numero = 0;

        //Condicion de bucle
        //Mientras la condicion del bucle sea true se repite el codigo entre ()
        while (numero <= 10) {

            System.out.println(numero);
            //Siempre dentro del bucle hay que actualizar la variable de control
            //Siempre dentro del bucle hay que actualizar la variable de control
            numero++;

        }

        System.out.println("El bucle ha terminado ");

        //Del 20 al 0
        int i = 20;

        while (i >= 0) {

            System.out.println(i);
            i--;
        }

        //Del 50 al 70 de 3 en 3
        numero = 50;

        while (numero <= 70) {

            System.out.println(numero);
            numero += 3;

        } 
        
    }

}
