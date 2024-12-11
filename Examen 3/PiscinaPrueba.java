public class PiscinaPrueba {
    public static void main(String[] args) {
        Piscina p1 = new Piscina();
        Piscina p2 = new Piscina(15,15,15);
        Piscina p3 = new Piscina(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("El método toString() devuelve: " + p2.toString());
        System.out.println("Los litros de agua de p2 son : " + p2.calculaLitrosAgua());
        System.out.println("Compara el objeto p1 y p3: " + p1.esMenor(p3));
    }
}
