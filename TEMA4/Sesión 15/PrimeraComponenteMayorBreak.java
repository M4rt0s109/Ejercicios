import java.util.Scanner;
public class PrimeraComponenteMayorBreak {
    public static int [ ] LeeVectorDouble (Scanner t) {
        System.out.println("Introduce el tamaño del vector: ");
        int tamaño = t.nextInt();
        int [ ] v = new int [tamaño];
        System.out.println("Introduce las componentes del vector: ");
        for(int i = 0; i < v.length;i++){
            v[i] = t.nextInt();
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] v1 = LeeVectorDouble(teclado);
        int posicion = -1;
        for (int i = 0;i < v1.length - 1 ;i++){
            if (v1[i] > v1[i + 1]) {
                posicion = i;
                break;
            }
        }
        System.out.println("La primera componente mayor que la siguiente está en la posición " + posicion);
    }
}