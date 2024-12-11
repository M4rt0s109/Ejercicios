/**Primer ejercicio del examen que crea una clase de una piscina y devuelve varios métodos relacionados con sus dimensiones
 * @author Diego Martos Sentís 
 * @version 1.0
 * @since 11/12/2024
 */
public class Piscina {
    /** Atributo que toma el valor del largo de la piscina*/
    private double largo;
    /**Atributo que toma el valor del ancho de la piscina */
    private double ancho;
    /**Atributo que toma el valor de la profundidad de la piscina */
    private double profundidad;

    /**Obtiene el largo de la piscina
     * @return el largo de la piscina
     */
    public double getLargo() {
        return largo;
    }
    /**Permite editar el largo de la piscina
     * @param largo de la piscina
     */
    public void setLargo(double largo) {
        if (largo > 0) this.largo = largo;
    }
    /**Obtiene el ancho de la piscina
     * @return el ancho de la piscina
     */
    public double getAncho() {
        return ancho;
    }
    /**Permite editar el ancho de la piscina
     * @param ancho de la piscina
     */
    public void setAncho(double ancho) {
        if (ancho > 0) this.ancho = ancho;
    }
    /**Obtiene la profundidad de la piscina
     * @return la profundidad de la piscina
     */
    public double getProfundidad() {
        return profundidad;
    }
    /**Permite editar la profundidad de la piscina
     * @param profundidad de la piscina
     */
    public void setProfundidad(double profundidad) {
        if (profundidad > 0) this.profundidad = profundidad;
    }

    /**Constructor con todos los parámetros
     * @param largo Largo de la piscina en metros
     * @param ancho Ancho de la piscina en metros
     * @param profundidad Profundidad de la piscina en metros
     */
    public Piscina(double largo, double ancho, double profundidad){
        setLargo(largo);
        setAncho(ancho);
        setProfundidad(profundidad);
    }
    /**Constructor con los valores por defecto
     * Todos los parámetros tienen el valor 1
     */
    public Piscina(){
        this(1,1,1);
    }
    /**Constructor copia de otro ya creado anteriormente
     * Sus parámetros toman los mismos valores que el anterior al cual está copiando
     * @param p Objeto Piscina
     * @see Piscina(double largo, double ancho, double profundidad)
     */
    public Piscina(Piscina p){
        this(p.getLargo(),p.getAncho(),p.getProfundidad());
    }

    /**Primer método para calcular los litros de agua que tiene la piscina multiplicando todos los parámetros para obtener metros cúbicos
     * @return un double con el valor de litros de agua
     */
    public double calculaLitrosAgua(){
        double L = this.getLargo() * this.getAncho() * this.getProfundidad();
        return L;
    }
    /**Método que permite comparra entre dos objetos para ver cual de ellos es menor en cuanto a litros
     * @return true si el que llama al método es menor
     * @return false si el que se pasa como parámetro es menor
     */
    public boolean esMenor(Piscina p){
        if (this.calculaLitrosAgua() < p.calculaLitrosAgua()) return true;
        else return false;
    }
    /**Método que permite imprimir en una String los valores de el objeto
     * @return una String con los valores del objeto con sus gets
     */
    @Override
    public String toString() {
        return "[ l x a: " + getLargo() + " x " + getAncho() + ", p: " + getProfundidad() + " ]";
    }
}