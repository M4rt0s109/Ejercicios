import java.util.Scanner;
public class StringsOctal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de números:");
        String s1 = teclado.next();
        int i = 0;
        while ((i < s1.length()) && (s1.charAt(i) < '8')){
            i++;
        }
        if (i < s1.length()) System.out.println("NO es octal");
        else System.out.println("Es octal");
        teclado.close();
    }
}