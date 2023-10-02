public class Main {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        int numero = 5;

        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                matriz[i][j] = numero;
                numero +=5;
            }
        }

        for (int i = 0; i< matriz.length; i++){
            System.out.println();
            for (int j = 0; j< matriz.length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}