import java.util.Scanner;
public class E2_otra_clase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce el número a comparar:");
        int numero = teclado.nextInt();
        int i = 4;
        while ((i <= 14) && ((numero % 2 != 0) && (numero % i != 0))) {
            i++;
        }
        if (i <= 14) System.out.println("El número cumple las condiciones");
        else System.out.println("El número no cumple las condiciones");
        teclado.close();
    }
}