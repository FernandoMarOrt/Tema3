package numerosromanos;

import javax.swing.JOptionPane;

public class numerosRomanos {

    public static void main(String[] args) {

        int menu;
        int numeroDecimal;
        int contarVocales = 0;
        
        do {
            
            String menuString = JOptionPane.showInputDialog(
                    "****************************************************\n"
                    + "1 Representar numeros romanos a partir de decimal\n"
                    + "2 Contar las vocales que tiene un nombre\n"
                    + "3 Salir del programa\n"
                    + "****************************************************");
            menu = Integer.parseInt(menuString);



            switch (menu) {
                case 1:

                    String numeroDecimalString = JOptionPane.showInputDialog(
                            "Dime un numero del 1 al 10"
                                    + " para representar en romano");
                    numeroDecimal = Integer.parseInt(numeroDecimalString);

                    switch (numeroDecimal) {
                        case 1:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 1 en romano es I");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 2 en romano es II");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 3 en romano es III");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 4 en romano es IV");
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 5 en romano es V");
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 6 en romano es VI");
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 7 en romano es VII");
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 8 en romano es VIII");
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 9 en romano es IX");
                            break;
                        case 10:
                            JOptionPane.showMessageDialog(null,
                                    "El numero 10 en romano es X");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,
                                    "Introduce un numero valido del"
                                            + " 1 al 10 por favor");
                    }

                    break;
                case 2:

                    String nombre = JOptionPane.showInputDialog(
                            "Dime un nombre");

                    nombre = nombre.toLowerCase();

                    for (int i = 0; i < nombre.length(); i++) {

                        if ((nombre.charAt(i) == 'a')
                                || (nombre.charAt(i) == 'e')
                                || (nombre.charAt(i) == 'i')
                                || (nombre.charAt(i) == 'o')
                                || (nombre.charAt(i) == 'u')) {
                            contarVocales++;
                        }
                    }

                    JOptionPane.showMessageDialog(null,
                            "El nombre " + nombre + " tiene "
                                    + contarVocales + " vocales");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Introduce un numero valido del menu por favor");
            }
            
        } while (menu != 3);    
    }

}
