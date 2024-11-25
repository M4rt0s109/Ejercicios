public class SustituirPorCerosMatriz {
    public static void MatrizModificada (int [][]m){
        int filas = m.length;
        int columnas = m[0].length;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                if (((j < columnas - 1) && (2 * m[i][j] == m[i][j + 1]))) || (((i < filas - 1) &&(2 * m[i][j] == m[i + 1][j]))) m[i][j] = 0;
            }
        }
    }
}