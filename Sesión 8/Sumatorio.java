import java.util.Scanner;
public class Sumatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce el valor máximo del sumatorio:");
        //El sumatorio funciona desde el 1 hasta el valor de m; si m vale 5 el sumatorio será 1 + 2 + 3 + 4 + 5.
        int m = teclado.nextInt();
        int i = 1;
        int suma = 0;
        while (i<=m) {
            suma += i;
            i++; 
        }
        System.out.printf("El valor del sumatorio es:%2d",suma);
        teclado.close();
    }
}