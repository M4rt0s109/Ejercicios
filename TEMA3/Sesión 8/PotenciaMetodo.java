import java.util.Scanner;
public class PotenciaMetodo {
    public static double Potencia (double base, double exponente) {
        double P = Math.pow(base,exponente);
        return P;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce la base y el exponente:\n");
        double base = teclado.nextDouble();
        double exponente = teclado.nextDouble();

        System.out.printf("El valor de la potencia es: %.2f",Potencia(base, exponente));
        teclado.close();
    }
}
