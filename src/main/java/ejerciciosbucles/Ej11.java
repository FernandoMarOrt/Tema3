package ejerciciosbucles;

public class Ej11 {

    public static void main(String[] args) {
        
        char i ='a';
        do{
            
            //Imprimo primero la letra del abcdario y despues paso la variable
            // i a int para que imprima el numero correspondiente de la letra
            System.out.println("El numero de la letra: " + i + " es: " + (int)i);
            i++;
            
        } while(i<='z');
    }

}