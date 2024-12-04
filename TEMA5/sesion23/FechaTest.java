package Ejercicios.TEMA5.sesion23;

public class FechaTest {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(2006);
        Fecha f2 = new Fecha(10,9,2006);
        Fecha f3 = new Fecha(f2);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f2 + " es igual a " + f3 + "  " + f2.equals(f3));
    }
}