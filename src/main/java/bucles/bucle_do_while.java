package bucles;

import java.util.Scanner;

public class bucle_do_while {
    
    //El bucle do while siempre hace al menos una interracion
    
    public static void main(String[] args) {
        
        //Imprimir del 0 al 10
        int numero = 10;
//        
//        do {
//            
//            System.out.println(numero);
//            numero--;
//            
//        } while (numero >=0); //Lo ejecuta hasta que la condicion sea true
//        
//        //Mientras que el numero se mayor que 0 repite el bucle
//        
//        System.out.println("Sale del bucle");
//        
//        
        Scanner teclado = new Scanner(System.in);
        
        int valor =0;
        
        do {
            
            System.out.println("Introduce un numero (100-200)");
            valor = teclado.nextInt();
            
        }while(valor<100 || valor>200);
        
    }
    
}
