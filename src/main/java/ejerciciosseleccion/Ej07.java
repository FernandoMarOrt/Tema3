package EjerciciosSeleccion;

import java.util.Scanner;

public class EJ07 {

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

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular "
                        + "el área de un cuadrado...");
                
                //Pedimos que introduzca la longitud de un lado
                System.out.println("Dime la longitud de un lado del cuadrado");
                double ladoCuadrado = entrada.nextDouble();
                
                //Calculamos el area del cuadrado
                double areaCuadrado = Math.pow(ladoCuadrado, 2);
                
                //Imprimo por pantalla el resultado
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el "
                        + "área de un triángulo...");
                
                //Pido que introduzca la base del triangulo
                System.out.println("Dime la base de el triangulo");
                double baseTriangulo = entrada.nextDouble();
                
                //Pido que introduzca la altura del triangulo
                System.out.println("Dime la altura de el triangulo");
                double alturaTriangulo = entrada.nextDouble();
                
                //Calculo del area del triangulo
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                
                //Imprimo por pantalla el resultado
                System.out.println("El area del triangulo es: " + areaTriangulo);
                
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el "
                        + "área de un círculo...");
                
                //Declaro la variable PI como constante con el valor de PI
                final double PI = Math.PI;
                
                //Pregunto el valor del radio del circulo
                System.out.println("Dime el radio de el circulo");
                double radioCirculo = entrada.nextDouble();
                
                //Calculo el area del circulo
                double areaCirculo = PI * (Math.pow(radioCirculo, 2));
                
                //Imprimo por pantalla el resultado
                System.out.println("El area del circulo es: " + areaCirculo);
                
                break;
            default:
                //Si no se ingresa ninguna de las opciones se imprime
                System.out.println("Ha seleccionado terminar");
                break;
        }
    }
}
