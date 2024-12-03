import java.util.Scanner;
public class ComponentesMayores {
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
        Scanner teclado = new Scanner(System.in);
        double [ ] v = LeeVectorDouble(teclado);
        System.out.println("Introduce un valor a comparar con las componentes del vector:");
        double valor = teclado.nextDouble();
        int contador = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] > valor) contador += 1;
        }
        System.out.println("El vector tiene " + contador + " componentes mayores que el valor " + valor);
        teclado.close();
    }
}