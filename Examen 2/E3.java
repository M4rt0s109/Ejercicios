import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Imprimimos la palabra normal
        System.out.println("Introduce la palabra a imprimir: ");
        String palabra = teclado.next();
        //Imprimimos la palabra por letras en distintas filas mediante un bucle
        for (int i = 0; i < palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }
        teclado.close();
    }
}