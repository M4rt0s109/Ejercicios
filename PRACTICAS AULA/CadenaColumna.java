public class CadenaColumna {
    public static String CadenaColumna (char[][] m, int col) {
        int filas = m.length;
        int columnas = m[0].length;
        String cadena = "";
        if ((col >= 0) && (col < columnas)){
            for (int i = 0; i < m.length; i++){
                cadena += m[i] [col];
            }
        }
        return cadena;
    }
}
