package ejercicios.TEMA5.sesion24;

public class JugadorAjedrez {
    private String nombre;
    private int edad;
    private int puntos;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int getK() {
        if ((this.edad <= 18) || (this.puntos < 2300)){
            return 40;
        }
        if ((this.puntos <= 2400) && (this.puntos >= 2300)){
            return 20;
        }
        if (this.puntos > 2400){
            return 10;
        }
        else return 0;
    }
    

    public JugadorAjedrez(String nombre, int edad, int puntos){
        setNombre(nombre);
        setEdad(edad);
        setPuntos(puntos);
    }
    public JugadorAjedrez(JugadorAjedrez x){
        this(x.getNombre(),x.getEdad(),x.getPuntos());
    }
    @Override
    public String toString() {
        return "JugadorAjedrez [nombre=" + getNombre() + ", edad=" + getEdad() + ", puntos=" + getPuntos() + ", K = " + getK() + "]";
    }
    public int actualizaELO(JugadorAjedrez x, int resultado){
        int puntos = (this.getPuntos() + this.getK()) * (resultado - (int)(((Math.pow(10,(this.getPuntos() / 400.0)))/((Math.pow(10,(this.getPuntos()/400.0))) + (Math.pow(10,(x.getPuntos() / 400.0)))))));
        return puntos;
    }   
}
