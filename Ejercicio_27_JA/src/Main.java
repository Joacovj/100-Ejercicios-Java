public class Main {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 5;
        char [][] cArr = new char[filas][columnas];
        char letra = 'A';

        for (int i=0; i< filas;i++){
            for (int j=0; j< columnas; j++){
                cArr[i][j] = letra;
                letra++;
            }
        }

        for (int i=0; i< filas;i++){
            System.out.println();
            for (int j=0; j<columnas; j++){
                System.out.print(cArr[i][j] + "\t");
            }
        }
    }
}