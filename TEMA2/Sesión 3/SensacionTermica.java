import java.util.Scanner;

public class SensacionTermica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce una temperatura: \n");
        double temperatura = teclado.nextDouble();
        System.out.printf("Introduce el valor de la velocidad del viento: \n");
        double velocidad_viento = teclado.nextDouble();

        double ST = 13.12 + (0.6215*temperatura) + ((0.3965*temperatura) - 11.37) *Math.pow(velocidad_viento, 0.16);
        System.out.printf("La sensación térmica es de : %f\n", ST); 
        
        teclado.close();
    }
}
