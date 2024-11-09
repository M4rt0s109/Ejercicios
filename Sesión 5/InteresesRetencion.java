import java.util.Scanner;
public class InteresesRetencion {

    public static double Interes (double cantidad, double tipo, int meses, boolean retenciones) {
        double x = cantidad * (tipo/100.0) * (meses/12.0);
        if(retenciones == true) return x * 0.81;
        else return x;
    }

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduce la cantidad de dinero, el tipo de intereses y el número de meses: ");
    double cantidad = teclado.nextDouble();
    double tipo = teclado.nextDouble();
    int meses = teclado.nextInt();
    System.out.printf("¿Hay retenciones?: ");
    boolean retenciones = teclado.nextBoolean();

    System.out.printf("El interés total generado es: %.2f", Interes(cantidad, tipo, meses,retenciones));

    teclado.close();
    }
}
