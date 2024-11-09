import java.util.Scanner;
public class Aceleracion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el valor del tiempo: ");
        double Tiempo = teclado.nextDouble(); 
        final double Km = 100*1000/3600;
       
        double Aceleracion = ((Km-0) / Tiempo);
        System.out.printf("La aceleración final es:%02f\n",Aceleracion);

        teclado.close();
    }
}
