package ejerciciosbucles;

import java.util.Scanner;

public class Ej06 {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        
        for (int x=1; x <= n; x++) {
            System.out.print(x);
            System.out.print(" - ");
        }
    }
    
}
