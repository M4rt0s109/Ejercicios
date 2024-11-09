import java.util.Scanner;
public class MCMReturn {
    public static int Minimo (int N1,int N2 ) {
        int i = Math.max(N1,N2);
        while (true){
            if ((i % N1 == 0) && (i % N2 == 0)) return i;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce el primer número: \n");
        int N1 = teclado.nextInt();
        System.out.printf("Introduce el segundo número: \n");
        int N2 = teclado.nextInt();
        System.out.printf("El mínimo común múltiplo es: " + Minimo(N1, N2));
        teclado.close();
    }
}
