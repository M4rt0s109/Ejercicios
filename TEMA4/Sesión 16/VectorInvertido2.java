import java.util.Scanner;
public class VectorInvertido2 {
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
        for (int i = 0; i < v.length/2; i++){
            int f = v[i];
            v[i] = v[(v.length - 1) - i];
            v[(v.length - 1) - i] = f;    
        }
        System.out.println("El vector invertido es: ");
        for (int i: v) System.out.print(i + " ");
        teclado.close();
    }
}