import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Leemos un vector de teclado
        System.out.println("Introduce el tamaño del vector: ");
        int tamaño = teclado.nextInt();
        int []v = new int [tamaño];
        System.out.println("Introduce las componentes del vector: ");
        for (int i = 0; i < v.length; i++){
            v[i] = teclado.nextInt();
        }
        //Hacemos la suma con las condiciones
        int suma = 0;
        for (int i = 0; i < v.length;i++){
            if ((i % 2 == 0) && (v[i] >= 2) && (v[i] <= 4)) suma += v[i];
        }
        //Imprimimos el resultado si es que hay,sino se imprimirá un 0
        System.out.println("La suma de las posiciones pares es: " + suma);
        teclado.close();
    }
}