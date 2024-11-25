import java.util.Scanner;
public class CadenasIgualesMetodo {
    public static boolean CadenasIguales (String cad1, String cad2){
        int i = 0;
        while (i < cad1.length()){
            if (cad1.charAt(i) != cad2.charAt(i)) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena1 = teclado.next();
        System.out.println("Introduce una cadena del mismo tamaño que la anterior: ");
        String cadena2 = teclado.next();
        if (CadenasIguales(cadena1, cadena2) == true) System.out.println("Las cadenas son iguales");
        else System.out.println("Las cadenas son distintas");
        teclado.close();
    }
}