package Ejercicios.TEMA5.sesion23;

public class Fecha {
    private int dia;
    private int mes;
    private int año;


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    

    public Fecha(Fecha f){
        this(f.getDia(), f.getMes(), f.getAño());
    }
    public Fecha(int año){
        this(1,1,año);
    }
    public Fecha(int dia, int mes, int año){
        setDia(dia);
        setMes(mes);
        setAño(año);
    }


    public boolean esAnterior(Fecha a){
        if ((this.año <= a.año) && (this.mes <= a.mes) && (this.dia < a.dia)) return true;
        else return false;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fecha other = (Fecha) obj;
        if (dia != other.dia)
            return false;
        if (mes != other.mes)
            return false;
        if (año != other.año)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Fecha: " + getDia() + "/" + getMes() + "/" + getAño() ;
    }   
}