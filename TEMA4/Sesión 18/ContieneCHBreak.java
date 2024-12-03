import java.util.Scanner;
public class ContieneCHBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena a comparar : ");
        String cadena = teclado.next();
        int i = 0;
        while (i < cadena.length()-1){
            if ((cadena.charAt(i) == 'c') && (cadena.charAt(i + 1) == 'h')) break;
            i++;
        }
        if (i < cadena.length()) System.out.println("La cadena contiene 'ch'");
        else System.out.println("La cadena no contiene un 'ch'");
        teclado.close();
    }
}
