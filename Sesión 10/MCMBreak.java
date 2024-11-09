import java.util.Scanner;
public class MCMBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce el primer número: \n");
        int N1 = teclado.nextInt();
        System.out.printf("Introduce el segundo número: \n");
        int N2 = teclado.nextInt();
        int i = Math.max(N1,N2);
        while (true){
            if ((i % N1 == 0) && (i % N2 == 0)) break;
            i++;
        }
        System.out.printf("El MCM es: " + i);
        teclado.close();
    }
}