package ejerciciosbucles;

public class Ej04 {
    
    //Imprime mientras que el numero sea menor que 11 es decir del 1 al 10
    // y despues en el do while lo hace a la inversa del 10 al 1

    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }
}

