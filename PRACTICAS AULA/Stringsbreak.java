public class Stringsbreak {
    public static void main(String[] args) {
        String s1 = new String("123456789");
        int i = 0;
        boolean condicion = false;
        while (i < s1.length() - 1){
            if (s1.charAt(i) == s1.charAt(i+1)){
            condicion = true;
            break;
            }
            i++;
        }
        if (condicion == true) System.out.println("La cadena tiene un elemento repetido consecutivo");
        else System.out.println("La cadena no tiene un elemento repetido consecutivo");
    }
}