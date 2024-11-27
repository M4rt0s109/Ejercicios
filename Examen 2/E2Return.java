import java.util.Scanner;
public class E2Return {
    public static int DobleDelSiguiente(int []v){
        int i = 0;
        while (i < v.length - 1){
            if (v[i] == 2 * v[i+1]){
                return i;
            }
            i++;
        }
        return 0;
    }
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
        //Tras ejecutar el método comprobamos el return y hacemos print dependiendo del mismo
        if (DobleDelSiguiente(v) == 0) System.out.println("El vector no tiene ningún elemento que sea el doble del siguiente");
        else System.out.println("El vector tiene un elemento que es el doble de su siguiente que es el elemento " + DobleDelSiguiente(v)); // Aquí vuelvo a llamar al método para pbtener la posición en la que está el elemento
        teclado.close();
    }
}