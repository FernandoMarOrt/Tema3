package EjerciciosSeleccion;

import java.util.Scanner;

public class EJ02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        //Primero pregunto al usuario por el numero a comparar
        System.out.println("Dime un numero");
        int numero = teclado.nextInt();
        
        
        //APARTADO A
        
        //Compora con operador ternario si el numero es mayor o igual que 135
        String resultado = (numero >= 135)?
                "mayor": //Si es mayor o igual imprimo mayor
                "menor"; //Si no imprimo que es menor 
        System.out.println(resultado);
        
        //APARTADO B
        
        //Compora con operador ternario si el numero es menor o igual que 0
        String resultadoB = (numero <= 0)?
                "Menor que cero": //Si es menor o igual imprimo menor que cero
                "Mayor que cero"; //Si no imprimo que es mayor que cero
        System.out.println(resultadoB);
        
        
                //APARTADO C
        
        //Obtengo el valor absoluto de un numero entero
        String resultadoC = (numero <= 0)?
                //Si es menor que cero multiplico al propio numero por -1
                "El valor absoluto de " + numero + " es " + (numero * -1):
                //Si no imprimo el valor absoluto directamente
                "El valor absoluto de " + numero + " es " + numero;
        System.out.println(resultadoC);
        
    }

}
