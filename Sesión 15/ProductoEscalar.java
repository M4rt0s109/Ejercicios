import java.util.Scanner;
public class ProductoEscalar {
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
        int [] v1 = LeeVectorDouble(teclado);
        int [] v2 = LeeVectorDouble(teclado);
        int PE = 0;
        for (int i = 0;i < v1.length;i++){
            PE += v1[i] * v2[i]; 
        }
        System.out.println("El producto esclara de v1 y v2 es "+ PE);
        if (PE == 0) System.out.println("Los vectores son ortogonales");
    }
}