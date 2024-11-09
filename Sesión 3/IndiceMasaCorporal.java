import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce un peso: \n");
        double peso = teclado.nextDouble();
        System.out.printf("Introduce una altura: \n");
        double altura = teclado.nextDouble()/100;

        double IMC = peso/(altura*altura);
        System.out.printf("El IMC es : %f\n", IMC);
      
      teclado.close();  
    }
}
