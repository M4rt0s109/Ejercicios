import java.util.Scanner;
public class VectorInvertido {
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
        int [] r = new int [v.length];
        for (int i = 0; i < v.length; i++){
            r[(v.length - 1) - i] = v[i];
        }
        System.out.println("El vector invertido es: ");
        for (int j = 0; j < r.length; j++){
            System.out.print(r[j]);
        }
        teclado.close();
    }
}