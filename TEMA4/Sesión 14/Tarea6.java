import java.util.Scanner;
public class Tarea6 {
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
        int [] v = LeeVectorDouble(teclado);
        int contador = 0;
        for (int i = 0; i < v.length-1; i++){
            if ((v[i] % 7 == 0) && (v[i] < v[i + 1])) contador++;
        }
        System.out.println("Hay " + contador + " componentes que son menores que la siguiente componente del vector y multiplo de 7");
    }
}