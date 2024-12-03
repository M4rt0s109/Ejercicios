import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce la base y el exponente:\n");
        double base = teclado.nextDouble();
        double exponente = teclado.nextDouble();

        double P = Math.pow(base,exponente);

        System.out.printf("El valor de la potencia es: %.2f",P);
        teclado.close();
    }
}