import java.util.Scanner;
public class SumaColumnas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int columnas = teclado.nextInt();
        int [ ] [ ] m = new int [filas] [columnas];
        System.out.println("Introduce los componentes: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i] [j] = teclado.nextInt();
        
        for (int j = 0;j < columnas;j++){  
            int suma =0;
            for (int i=0;i < m.length;i++)
                suma+=m[i][j];
                System.out.print(suma);
        }
    }
}