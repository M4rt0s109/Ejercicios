import java.util.Scanner;
public class SecuanciaOrdenada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce una secuencia de números: ");
        int numero = teclado.nextInt();
        int i = 0;
        while ((numero > 0) && (numero != 0)){
            i = numero;
            numero = teclado.nextInt();   
        }
        if (numero != 0) System.out.printf("La secuencia está desordenada");
        else System.out.printf("La secuencia está ordenada");
        teclado.close();
    }
}