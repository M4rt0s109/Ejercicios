import java.util.Scanner;
public class ContieneCHMetodo {
    public static boolean ContieneCH (String cadena){
        int i = 0;
        while (i < cadena.length()-1){
            if ((cadena.charAt(i) == 'c') && (cadena.charAt(i + 1) == 'h')) return true;
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena a comparar: ");
        String cadena = teclado.next();
        if (ContieneCH(cadena) == true) System.out.println("La cadena contiene un 'ch'");
        else System.out.println("La cadena no contiene 'ch'");
        teclado.close();
    }
}