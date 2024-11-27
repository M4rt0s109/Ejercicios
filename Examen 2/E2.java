import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Leemos un vector de teclado
        System.out.println("Introduce el tamaño del vector: ");
        int tamaño = teclado.nextInt();
        int []v = new int [tamaño];
        System.out.println("Introduce las componentes del vector: ");
        for (int i = 0; i < v.length; i++){
            v[i] = teclado.nextInt();
        }
        //Hacemos la búsqueda con las condiciones
        int i = 0;
        int elemento = 0;
        while (i < v.length - 1){
            if (v[i] == 2 * v[i+1]){
                elemento = v[i];
                break;
            }
            i++;
        }
        //Hacemos un print dependiendo si las condiciones son ciertas o no
        if (i < v.length - 1) System.out.println("El elemento el cual es el doble de su siguiente es " + elemento);
        else System.out.println("No hay ningún elemento que sea el doble de su siguiente");
        teclado.close();
    }
}