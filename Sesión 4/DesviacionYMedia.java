import java.util.Scanner;
public class DesviacionYMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce 4 números: ");
        double N1 = teclado.nextDouble();
        double N2 = teclado.nextDouble();
        double N3 = teclado.nextDouble();
        double N4 = teclado.nextDouble();

        double media = (N1 + N2 + N3 + N4) / 4;
        double desviacion = Math.sqrt((N1 - (Math.pow(media,2))) + (N2 - (Math.pow(media,2))) + (N3 - (Math.pow(media,2))) + (N4 - (Math.pow(media,2))));
        
        System.out.printf("La media es : %f\n",media);
        System.out.printf("La desviación típica es : %f\n",desviacion);

        teclado.close();
    }
}
