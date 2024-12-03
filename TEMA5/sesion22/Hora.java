package ejercicios.sesion22;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;


    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    public Hora(){
        setHora(0);
        setMinutos(0);
        setSegundos(0);
    }
    public Hora(Hora h){
        setHora(h.getHora());
        setMinutos(h.getMinutos());
        setSegundos(h.getSegundos());
    }
    public Hora(int hora){
        setHora(hora);
        setMinutos(0);
        setSegundos(0);
    }
    public Hora(int hora,int minutos, int segundos){
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }
}
