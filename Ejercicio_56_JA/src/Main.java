import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte [][] matrix = new byte[4][4];
        int contador = 0;

        for (int i=0; i< matrix.length; i++) {
            matrix[i][i] = 1;
        }

        for (int i=0; i<4; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}