import java.util.Scanner;
public class ElementosIguales {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el número de filas: ");
        int filas = t.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int columnas = t.nextInt();
        int [ ] [ ] m = new int [filas] [columnas];
        System.out.println("Introduce los componentes: ");
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = t.nextInt();
            } 
        }
        System.out.println("Introduce la posición a comprobar: ");
        int fil = t.nextInt();
        int col = t.nextInt();
        int elemento = m[fil][col];
        System.out.println("El elemento a comparar es: " + elemento);
        int contador_filas = 0;
        for (int j = 0;j < columnas;j++){
            if (m[fil][j] == elemento) contador_filas += 1;
        }
        int contador_columnas = 0;
        for (int i = 0;i < filas;i++){
            if (m[i][col] == elemento) contador_columnas+= 1;
        }
        System.out.println("El elemento se repite " + (contador_filas - 1) + " veces en la fila " + (fil));
        System.out.println("El elemento se repite " + (contador_columnas - 1) + " veces en la columna " + (col));
        t.close();
    }
}