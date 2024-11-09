public class Strings {
    public static void main(String[] args) {
        String s1 = new String("1224567890");
        int i = 0;
        while((i < s1.length() - 1) && (s1.charAt(i) != s1.charAt(i+1))){
            i++;
        }
        if (i < s1.length() - 1) System.out.println("La cadena tiene un elemento repetido consecutivo");
        else System.out.println("La cadena no tiene un elemento repetido consecutivo");
    }
}