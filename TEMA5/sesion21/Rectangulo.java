package Ejercicios.TEMA5.sesion21;

public class Rectangulo {
    private double x;
    private double y;
    private double base;
    private double altura;

    
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    public Rectangulo(double x,double y,double base,double altura){
        setX(x);
        setY(y);
        setBase(base);
        setAltura(altura);
    }
    public Rectangulo(){
        setX(0);
        setY(0);
        setBase(1);
        setAltura(1);
    }
    public Rectangulo(int base, int altura){
        setX(0);
        setY(0);
    }
    public Rectangulo(Rectangulo r){
        setX(r.getX());
        setY(r.getY());
        setBase(r.getBase());
        setAltura(r.getAltura());
    }


    public double calculaArea(double base, double altura){
        return base * altura;
    }
    public double calculaPerimetro(double x, double y){
        return (2 * x) + (2 * y);
    }
}