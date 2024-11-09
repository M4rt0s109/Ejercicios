import java.util.Scanner;
public class E1_otra_clase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce una secuencia de números(positivos o negativos) acabada en 0: \n");
        int numero = teclado.nextInt();
        int negativos = 0;
        int positivos = 0;
        while (numero != 0) {
            if (numero > 0) positivos ++;
            else negativos ++;
            numero = teclado.nextInt();
        }
        if (positivos > negativos) System.out.println("Hay más números positivos que negativos.");
        else if (positivos < negativos) System.out.println("Hay más números negativos que positivos.");
        else System.out.println("Hay la misma cantidad de números positivos que negativos.");
        teclado.close();
    }
}