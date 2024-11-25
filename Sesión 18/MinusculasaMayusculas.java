import java.util.Scanner;
public class MinusculasaMayusculas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String palabra = teclado.next();
        int i = 0;
        while (i < palabra.length()) {
            if ((palabra.charAt(i) >= 'a') && (palabra.charAt(i) <= 'z')) 
                System.out.print((char)(palabra.charAt(i) - 32));
            else 
                System.out.print((char)(palabra.charAt(i)));    
            i++;
        }
        teclado.close();
    }
}