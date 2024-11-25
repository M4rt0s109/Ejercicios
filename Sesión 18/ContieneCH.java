import java.util.Scanner;
public class ContieneCH {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena a comparar : ");
        String cadena = teclado.next();
        int i = 0;
        while ((i < cadena.length()-1) && ((cadena.charAt(i) == 'c') && (cadena.charAt(i + 1) == 'h'))){
            i++;
        }
        if (i < cadena.length()-1) System.out.println("La cadena contiene 'ch'");
        else System.out.println("La cadena no contiene un 'ch'");
        teclado.close();
    }
}