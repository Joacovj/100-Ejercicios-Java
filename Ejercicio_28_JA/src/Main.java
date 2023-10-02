public class Main {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 5;
        byte [][] matrix = new byte[filas][columnas];

        for (int i=0; i< filas;i++){
            for (int j=0; j< columnas;j++){
                if (i == 0 || i == filas-1 || j == 0 || j == columnas-1)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }

        for (int i=0; i< filas;i++){
            System.out.println();
            for (int j=0; j< columnas;j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
}