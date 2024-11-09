import java.util.Scanner;

public class CalcularELO {
    public static int ELO (int ELOa, int ELOb, double resultado) {
        double pA = Math.pow(10,ELOa/400.0);
        double pB = Math.pow(10,ELOb/400.0);
        return (int) (ELOa + (40 * (resultado - (pA / (pA - pB)))));
    }  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce el elo de A y de B: ");
        int ELOa = teclado.nextInt();
        int ELOb = teclado.nextInt();
        System.out.printf("Introduce quien ha ganado: ");
        double resultado = teclado.nextDouble();
    
        System.out.printf("El elo del jugador A es:%d\n",ELO(ELOa, ELOb, resultado));

        teclado.close();
    }
}


