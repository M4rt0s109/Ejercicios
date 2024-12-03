import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número:");
        int n = teclado.nextInt();
        int i = 0;

        while (i<=10) { 
            int multi = n * i;
            System.out.println(n + "x" + i + "=" + multi);
            i++;
        }
        teclado.close();
    }
}