import java.util.Scanner;
public class DetectarNumeroBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce los numeros de la secuencia: \n");
        int numero = teclado.nextInt();
        while (numero > 0) {
            if ((numero % 2 == 0) && (numero % 5 != 0)) break;
            numero = teclado.nextInt();
        }     
        if (numero > 0)  System.out.printf("La secuencia contiene un número impar o múlriplo de 5");
        else System.out.printf("La secuencia no contiene un número impar o múltiplo de 5");
        teclado.close();
    }
}
