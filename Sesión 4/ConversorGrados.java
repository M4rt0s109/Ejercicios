import java.util.Scanner;

public class ConversorGrados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce una temperatura: \n");
        double farenheit = teclado.nextDouble();
        
        double celsius = (farenheit - 32) * 5 / 9;
        System.out.printf("La temperatura en Celsius es : %f\n", celsius);
        
        teclado.close();
    }
}
