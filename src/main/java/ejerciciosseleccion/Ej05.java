
package ejerciciosseleccion;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular "
                    + "el área de un cuadrado...");
            
            //Pedimos que introduzca la longitud de un lado
            System.out.println("Dime la longitud de un lado del cuadrado");
            double ladoCuadrado = entrada.nextDouble();
            
            //Calculamos el area del cuadrado 
            double areaCuadrado = Math.pow(ladoCuadrado, 2);
            
            //Lo imprimo por pantalla
            System.out.println("El area del cuadrado es: " + areaCuadrado);

        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el "
                        + "área de un triángulo...");
                
                //Pido que introduza la base del triangulo
                System.out.println("Dime la base de el triangulo");
                double baseTriangulo = entrada.nextDouble();

                //Pido que introduzca la altura del triangulo
                System.out.println("Dime la altura de el triangulo");
                double alturaTriangulo = entrada.nextDouble();
                
                //Calculo del area del triangulo
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                
                //Imprimo por pantalla el resultado
                System.out.println("El area del triangulo es: " + areaTriangulo);

            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el "
                            + "área de un círculo...");
                    
                    //Declaro como constante la variable PI con el valor de PI
                    final double PI = Math.PI;

                    //Pregunto por el radio del circulo
                    System.out.println("Dime el radio de el circulo");
                    double radioCirculo = entrada.nextDouble();
                    
                    //Calculo el area de circulo 
                    double areaCirculo = PI * (Math.pow(radioCirculo, 2));
                    
                    //Imprimo por pantalla el resultado
                    System.out.println("El area del circulo es: " + areaCirculo);

                } else {
                    
                    //Si no se cumple ninguna de las condiciones se imprime
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }
    }
}
