import java.util.Scanner;
public class MenorAMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce 2 números: ");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        
        if (A < B ) System.out.printf("El orden es : %.2f %.2f",A,B);
        if (B < A) System.out.printf("El orden es : %.2f %.2f",B,A);
        if (A == B) System.out.printf("No valen dos numeros iguales");

        teclado.close();
    }

}