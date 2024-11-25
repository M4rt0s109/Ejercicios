import java.util.Scanner;
public class LetraDNI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número DNI: ");
        int DNI = teclado.nextInt();
        System.out.println("Introduce la letra del DNI");
        String L = teclado.next();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = DNI % 23;
        if (L.charAt(0) == letras.charAt(numero))System.out.println("La letra coincide con la del DNI");
        else System.out.println("La letra es incorrecta");
        teclado.close();
    }
}