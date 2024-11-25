import java.util.Scanner;
public class MinimoComponenteVector {
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
        int minimo = 100;
        for (int i = 0; i < v.length; i++){
            if (v[i] < minimo) minimo = v[i];
        }
        System.out.println("El valor mínimo del vector es " + minimo);
        teclado.close();
    }
}