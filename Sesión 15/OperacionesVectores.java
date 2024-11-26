import java.util.Scanner;
public class OperacionesVectores {
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
    public static int ProductoEscalar(int[] v1, int[] v2) {
        
        int PE = 0;
        for (int i = 0;i < v1.length;i++){
            PE += v1[i] * v2[i];
        }
        return PE;
    }
    public static double Modulo(int[] v1) {
        double M = Math.sqrt(ProductoEscalar(v1, v1));
        return M;
    }
    public static double Angulo(int[] v1, int[] v2){
        double A = Math.acos((ProductoEscalar(v1, v2)) / (Modulo(v1) * (Modulo(v2))));
        return A;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vec1 = LeeVectorDouble(teclado);
        int [] vec2 = LeeVectorDouble(teclado);
        
        int PE=ProductoEscalar(vec1, vec2);
        System.out.println("El producto esclara de v1 y v2 es "+ PE);
        if (PE == 0) System.out.println("Los vectores son ortogonales");
        
        double M = Modulo(vec1);
        System.out.println("El módulo del primer vector es " + M);

        double A = Angulo(vec1, vec2);
        System.out.println("El ángulo formado por los vectores es " + A);
    }
}