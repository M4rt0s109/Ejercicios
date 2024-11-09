import java.util.Scanner;
public class PiedraPapelTijera {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduce un valor : \n r = Piedra \n p = Piedra \n S = tijeras \n");
    char jugador = teclado.next().charAt(0);
    double ordenador = Math.random();
    if (ordenador <= 0.33) {
        ordenador = 'r';
        System.out.printf("El valor del ordenador es r\n");
    }
    else if (ordenador <= 0.66) {
        ordenador = 'p';
        System.out.printf("El valor del ordenador es p\n");
    }
    else {
        ordenador = 's';
        System.out.printf("El valor del ordenador es s\n");
    }

    if (ordenador == jugador) System.out.printf("La partida termina en empate");
    else if (((ordenador == 'r') && (jugador == 's')) || ((ordenador == 's') && (jugador =='p')) || ((ordenador == 'p') && (jugador == 'r'))) System.out.printf("El ganadores el ordenador");
    else System.out.printf("La partida la gana el jugador");

    teclado.close();
    }
}


