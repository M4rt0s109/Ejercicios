import java.util.Scanner;
public class DetectarNumeroReturn {
    public static boolean Detectar () {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        while (numero > 0){
            if ((numero % 2 == 1) || (numero % 5 == 0)) return true;
            numero = teclado.nextInt();
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce la seuencia de numeros: \n");
       
        if (Detectar() == true) System.out.printf("La secuencia contiene un número impar o múltiplo de 5");
            else System.out.printf("La secuencia no contiene un número impar o múltiplo de 5");
        teclado.close();
    }
}
