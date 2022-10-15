package EjerciciosSeleccion;

public class EJ09 {

    public static void main(String[] args) {

        //La variable2 vale 100 ya que no hay break cuando llega
        // a la tercera opcion por lo cual continua hasta la ultima que es 100
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;
        }

    }

}
