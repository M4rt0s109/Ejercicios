package ejercicios.sesion22;

public class TestHora {
    public static void main(String[] args) {
       Hora h1 = new Hora(1, 30, 0);
       Hora h2 = new Hora(1);
       Hora h3 = new Hora(h2);
       Hora h4 = new Hora();
       System.out.println("Hora: " + h1.getHora() + " Minutos: " + h1.getMinutos() + " Segundos: " + h1.getSegundos());
       System.out.println("Hora: " + h2.getHora() + " Minutos: " + h2.getMinutos() + " Segundos: " + h2.getSegundos());
       System.out.println("Hora: " + h3.getHora() + " Minutos: " + h3.getMinutos() + " Segundos: " + h3.getSegundos());
       System.out.println("Hora: " + h4.getHora() + " Minutos: " + h4.getMinutos() + " Segundos: " + h4.getSegundos());
    }
}