import java.util.Scanner;
public class MatrizTraspuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz cuadrada: ");
        int tamaño = teclado.nextInt();
        System.out.println("Introduce las componentes de la amtriz: ");
        int [] [] matriz1 = new int [tamaño] [tamaño];
        int [] [] matriz2 = new int [tamaño] [tamaño];
        for (int i = 0; i < matriz1.length;i++){
            for (int j = 0; j < matriz1[i].length;j++){
                matriz1[i] [j] = teclado.nextInt();
            }
        }
        //Creamos la traspuesta en la matriz2 con valores nulos
        for (int i = 0; i < matriz1.length;i++){
            for (int j = 0; j < matriz1[i].length;j++){
                matriz2 [j] [i] = matriz1[i] [j];
            }
        }
        //Imprimimos la matriz2
        for (int i = 0; i < matriz1.length;i++){
            for (int j = 0; j < matriz1[i].length;j++){
            System.out.print(matriz2[i] [j]);
            }
        System.out.println();
        }
        teclado.close();
    }
}