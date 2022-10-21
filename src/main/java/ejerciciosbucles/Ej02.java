package ejerciciosbucles;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        
        //El bucle va a imprimir x mientras que x sea menor o igual que el numero
        //que hemos introducido

        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
}
