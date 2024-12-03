import com.sun.source.doctree.AuthorTree;
import java.util.Scanner;
public class MenorAMayorIF {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce 2 números: ");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        
        if ((A < B)){
            if (B < C) System.out.printf("El orden es: %.2f %.2f %.2f",A,B,C);
            else System.out.printf("El orden es: %.2f %.2f %.2f",A,C,B);
        }
        if ((B < C)){
            if (A < C) System.out.printf("El orden es: %.2f %.2f %.2f",B,A,C);
            else System.out.printf("El orden es: %.2f %.2f %.2f",B,C,A);
        }
        if ((C < A)){
            if (A < B) System.out.printf("El orden es: %.2f %.2f %.2f",C,);
            else System.out.printf("El orden es: %.2f %.2f %.2f",C);
        }
        teclado.close();
    }

}
