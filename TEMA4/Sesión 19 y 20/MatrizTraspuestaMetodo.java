import java.util.Scanner;
public class MatrizTraspuestaMetodo {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el numero de filas y de columnas de la matriz: ");
        int filas=teclado.nextInt();
        int columnas=teclado.nextInt();
        while (filas!=columnas){
            System.out.println("La matriz debe ser cuadrada, introduce valores válidos");
            filas=teclado.nextInt();
            columnas=teclado.nextInt();
        }
        int [][]matriz=new int[filas][columnas];
        System.out.println("Introduce los valores de la matriz ");
        for (int i=0;i<matriz.length;i++)
            for(int j=0;j<matriz[i].length;j++)
                matriz[i][j]=teclado.nextInt();
        for (int i = 1; i < matriz.length; i++) {
            for (int j =0 ; j < i; j++) {     
                int aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;    

            }
        }   
        System.out.println("Matriz leida:");
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++)
                    System.out.print(matriz[i][j]+" ");
            System.out.println();
        }
        teclado.close();
    }
}