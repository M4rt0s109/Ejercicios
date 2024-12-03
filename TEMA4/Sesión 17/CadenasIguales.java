import java.util.Scanner;
public class CadenasIguales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena1 = teclado.next();
        System.out.println("Introduce una cadena del mismo tamaño que la anterior: ");
        String cadena2 = teclado.next();
        int i = 0;
        while (i < cadena1.length()){
            if (cadena1.charAt(i) != cadena2.charAt(i)) break;
            i++;
        }
        if (i < cadena1.length()) System.out.println("Las cadenas son distintas"); //Aqui siempre repetir la condicion del bucle!!!!!
        else System.out.println("Las cadenas son iguales");
        teclado.close();
    }
}