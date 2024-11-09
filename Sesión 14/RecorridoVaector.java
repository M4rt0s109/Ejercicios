import java.util.Scanner;
public class RecorridoVaector {
    public static double [ ] LeeVectorDouble (Scanner t) {
        System.out.println("Introduce el tamaño del vector: ");
        int tamaño = t.nextInt();
        double [ ] v = new double [tamaño];
        System.out.println("Introduce las componentes del vector: ");
        for(int i = 0; i < v.length;i++){
            v[i] = t.nextDouble();
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double [] v = LeeVectorDouble(teclado);
        int contador = 0;
        for (int i = 0; i < v.length - 1; i++){
            if (v[i] < v[i + 1]) contador ++;
        }
        System.out.println("Hay " + contador + " componentes que son menores que la siguiente componente del vector.");
    }
}