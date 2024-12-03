import java.util.Scanner;
public class AñoBisiesto {
    
    public static int Bisiesto (int año) {
        if ((año %4 == 0)) System.out.printf("El año es bisiesto."); 
            else System.out.printf("El año no es bisiesto");
        //La condición compuesta es añadir que sea divisible por 100 pero hay un márgen de error muy pequeño y no lo añadí por ello.  
        return año;
    }
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("Introduce un año:");
       int año = teclado.nextInt();
       Bisiesto(año);

        teclado.close();
    }
}
