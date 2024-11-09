import java.util.Scanner;
public class ProductoParesSecuencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce los números a multiplicar distintos de 0:\n");
        int numero = teclado.nextInt();
        int i = 1;
        double multiplicación = 1;
        while (numero != 0){
            if (i % 2 == 0) multiplicación = multiplicación * numero;
            i++;
            numero = teclado.nextInt();
        }
        System.out.printf("El producto de los pares de la secuencia es: " + multiplicación);
        teclado.close();
    }
}