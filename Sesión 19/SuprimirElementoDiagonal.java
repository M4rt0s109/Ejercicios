import java.util.Scanner;
public class SuprimirElementoDiagonal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz cuadrada: ");
        int tamaño = teclado.nextInt();
        char [ ] [ ] m = new char [tamaño] [tamaño];
        System.out.println("Introduce los componentes: ");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i] [j] = teclado.next().charAt(0);
            }
        }
        System.out.println("Introduce un caracter a comparar: ");
        char caracter = teclado.next().charAt(0);
        for(int i = 0;i < tamaño;i++){
            for (int j = 0; j < tamaño;j++){
                if (i == j){
                    if (m[i][j] == caracter) m[i][j] = '-';
                }
            }
        }
        for(int i = 0;i < tamaño;i++){
            for (int j = 0; j < tamaño;j++)
                System.out.print(m[i][j] + " ");
        System.out.println();
        }
    }
}