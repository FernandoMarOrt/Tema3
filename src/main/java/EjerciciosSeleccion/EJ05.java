
package EjerciciosSeleccion;

import java.util.Scanner;

public class EJ05 {

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

            System.out.println("Dime la longitud de un lado del cuadrado");
            double ladoCuadrado = entrada.nextDouble();

            double areaCuadrado = Math.pow(ladoCuadrado, 2);

            System.out.println("El area del cuadrado es: " + areaCuadrado);

        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el "
                        + "área de un triángulo...");

                System.out.println("Dime la base de el triangulo");
                double baseTriangulo = entrada.nextDouble();

                System.out.println("Dime la altura de el triangulo");
                double alturaTriangulo = entrada.nextDouble();

                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

                System.out.println("El area del triangulo es: " + areaTriangulo);

            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el "
                            + "área de un círculo...");

                    final double PI = Math.PI;

                    System.out.println("Dime el radio de el circulo");
                    double radioCirculo = entrada.nextDouble();

                    double areaCirculo = PI * (Math.pow(radioCirculo, 2));

                    System.out.println("El area del circulo es: " + areaCirculo);

                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }
    }
}
