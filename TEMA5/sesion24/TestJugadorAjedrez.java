package ejercicios.TEMA5.sesion24;

public class TestJugadorAjedrez {
    public static void main(String[] args) {
        JugadorAjedrez j1 = new JugadorAjedrez("Antonio", 17, 1800);
        JugadorAjedrez j2 = new JugadorAjedrez("Parrales",18,2000);
        System.out.println(j1);
        System.out.println(j2);
        System.out.print(j1.actualizaELO(j2,1));
    }
}