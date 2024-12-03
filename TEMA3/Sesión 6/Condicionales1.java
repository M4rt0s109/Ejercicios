import java.util.Scanner;
public class Condicionales1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce un número: ");
        int X = teclado.nextInt();
        
        if (X > 0 && X < 50) X = 3 * X;
        if (X > 50) X = X * 2;
        if (X < 0) X = -X;
        System.out.printf("El valor de X es:%2d ",X);
        
        teclado.close();
    }
}


