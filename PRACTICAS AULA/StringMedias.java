import java.util.Scanner;
public class StringMedias {
    public static int [ ] LeeVectorDouble (Scanner t) {
        System.out.println("Introduce un tamaño para el vector que sea múltiplo de 3: ");
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
        double [] r = new double[v.length / 3];
        for(int i = 0,j = 0; i < v.length;i++){
            r[j] = (v[i + 2] + v[i + 1] + v[i]) / 3.0;
        }
    }
}
