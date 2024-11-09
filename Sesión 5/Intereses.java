import java.util.Scanner;
public class Intereses {
    public static double Interes (double cantidad, double tipo, int meses) {
        return cantidad * (tipo/100.0) * (meses/12.0);
    }

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduce la cantidad de dinero, el tipo de intereses y el número de meses: ");
    double cantidad = teclado.nextDouble();
    double tipo = teclado.nextDouble();
    int meses = teclado.nextInt();

    System.out.printf("El interés total generado es: %.2f", Interes(cantidad, tipo, meses));

    teclado.close();
    }
}

