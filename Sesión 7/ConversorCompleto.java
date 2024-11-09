import java.util.Scanner;
public class ConversorCompleto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Elija una opción:\n 1- Millas a km \n 2- Metros a Yardas \n 3- Libras a Kg \n");
        int opción = teclado.nextInt();
        if (opción == 1) {
            System.out.printf("Inserta el valor de kilometros a convertir \n");
            double km = teclado.nextDouble();
            double millas = km * 1.60934;
            System.out.printf("%2f kilometros son %2f millas",km,millas);
        }
        else if (opción == 2) {
            System.out.printf("Inserta el valor de metros a convertir \n");
            double metro = teclado.nextDouble();
            double yarda = metro * 1.09361;
            System.out.printf("%2f metros son %2f yardas",metro,yarda);
        }
        else {
            System.out.printf("Inserta el valor de libras a convertir \n");
            double libra = teclado.nextDouble();
            double kg = libra * 0.453592;
            System.out.printf("%2f libras son %2f kgs",libra,kg);
        }
        teclado.close();
    }
}
