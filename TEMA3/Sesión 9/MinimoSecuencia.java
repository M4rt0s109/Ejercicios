import java.util.Scanner;
public class MinimoSecuencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce valores hasta que sea positivo:");
        int numero = teclado.nextInt();
        int minimo = 100;
        while (numero < 0){
            if (numero < minimo) minimo = numero;
            numero = teclado.nextInt();
        }
        System.out.printf("El mínimo de la secuencia es el: " + minimo);
        teclado.close();
    }
}