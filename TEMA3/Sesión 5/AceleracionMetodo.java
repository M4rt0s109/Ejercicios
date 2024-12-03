import java.util.Scanner;
public class AceleracionMetodo {
    
    public static double Aceleracion (int T) {
        final double Km = 100*1000/3600;
        return Km / T;
    } 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce el tiempo: ");
        int T = teclado.nextInt();

        System.out.printf("El valor de la aceleracion es:%.2f\n",Aceleracion(T));

        teclado.close();
    }
}
