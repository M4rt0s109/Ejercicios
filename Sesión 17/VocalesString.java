import java.util.Scanner;
public class VocalesString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena para contar sus vocales: ");
        String cadena = teclado.next();
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++){
            if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'o')) vocales += 1;
        }
        System.out.println("La cadena contiene " + vocales + " vocales");
        teclado.close();
    }
}