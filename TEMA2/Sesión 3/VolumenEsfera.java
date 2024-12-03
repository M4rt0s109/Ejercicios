import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el radio de la esfera: ");
        final double PI = 3.1416;
        double radio = teclado.nextDouble();
        double volumen = (4.0/3.0)*PI*Math.pow(radio,3);
        System.out.printf("El volumen de la esfera es : %f\n", volumen);
        teclado.close();

    }
}