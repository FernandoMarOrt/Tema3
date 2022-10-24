package ejerciciosbucles;

public class Ej01 {
    
    //imprime x mientras que el numero sea menor o igual que 100

    public static void main(String[] args) {
        int x = 1;

        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
}
