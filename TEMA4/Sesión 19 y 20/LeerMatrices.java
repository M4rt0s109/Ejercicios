import java.util.Scanner;
public class LeerMatrices {
    public static int [ ] [ ] LeerMatrices (Scanner t){
        System.out.println("Introduce el número de filas: ");
        int filas = t.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int columnas = t.nextInt();
        int [ ] [ ] m = new int [filas] [columnas];
        System.out.println("Introduce los componentes: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i] [j] = t.nextInt();
        return m;
    }
    public static void ImprimirMatrices (int [ ] [ ] m) {
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length;j++){
                System.out.print(m[i] [j] + " ");
            }    
            System.out.println();
        }
    }
    public static void ImprimeMatrizAlReves (int [ ] [ ] m){
        for (int i = m.length - 1; i >= 0; i--){
            for (int j = m[i].length - 1; j >= 0; j--){
                System.out.print(m[i] [j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [ ] [ ] matriz = LeerMatrices(teclado);
        System.out.println("La matriz al revés es: ");
        ImprimeMatrizAlReves(matriz);
        teclado.close();
    }
}