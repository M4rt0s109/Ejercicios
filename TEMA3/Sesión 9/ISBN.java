import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.printf("Introduce el ISBN: ");
       long isbn = teclado.nextLong();
       int factor = 10;
       double cifra = 0;
       double producto = 0;
       double suma = 0;

       while(factor > 0){
        cifra = isbn % 10;
        producto = cifra * factor;
        suma += producto;
        isbn = isbn / 10;
        factor--;
       }

       System.out.println("El valor de la suma es : " + suma);
       if (suma % 11 == 0) System.out.printf("El código ISBN es válido");
        else System.out.printf("El código ISBN no es válido");
       teclado.close();
    }
}