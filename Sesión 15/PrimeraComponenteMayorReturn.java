import java.util.Scanner;
public class PrimeraComponenteMayorReturn {
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
    public static int ComponenteMayor (int[] vec1){
        int posicion = -1;
        for (int i = 0;i < (vec1.length - 1) && (posicion == -1);i++){
            if (vec1[i] > vec1[i + 1]) posicion = i;
        }
        return posicion;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] v1 = LeeVectorDouble(teclado);
        System.out.println("La primera componente mayor que la siguiente está en la posición " + ComponenteMayor(v1));
    }
}