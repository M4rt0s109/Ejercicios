public class MediaVectores {
    public static void main(String[] args) {
        int [] v = {5,4,3,9,0,7};
        System.out.print("v = {");
        for (int i = 0;i < v.length; i++){
            System.out.print(" " + v[i]);
        }
        System.out.print(" }\n");
        int suma  = 0;
        int media = 0;
        for (int i = 0;i < v.length; i++){
            suma += v[i];
            if (i == v.length - 1 ) media = suma / i;
        }
        System.out.println("La media de los componentes del vector es: " + media);
    }
}