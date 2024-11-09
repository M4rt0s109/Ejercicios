import java.util.Scanner;
public class BuscarW {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce una cadena de texto acabada en z: \n");
        char letra = teclado.next().charAt(0);
        while (((letra != 'z') && (letra != 'Z')) && ((letra != 'w') && (letra !='W'))) {
            letra = teclado.next().charAt(0);
        } 
        if ((letra != 'z') && (letra != 'Z')) System.out.printf("Existe una W en la cadena de texto");
        else System.out.printf("No existe ninguna W en la cadena de texto");
        teclado.close();
    }
}