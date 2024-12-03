import java.util.Scanner;
public class Calificaciones {
    public static double Notas (double t, double p) {

        if ((t >= 9) && (p >= 9)) System.out.printf("La nota es un sobresaliente");
        else if ((t >= 7.5) && (p >= 7.5)) System.out.printf("La nota es un notable");
        else if ((t >= 5) && (p >= 5)) System.out.printf("La nota es un suficiente");
        else System.out.printf("La nota es un insuficiente");
        return p;
    }
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.printf("Introduce las notas del alumno: \n");
       double t = teclado.nextDouble();
       double p = teclado.nextDouble();
       Notas(t, p);

    teclado.close();
    }
}
