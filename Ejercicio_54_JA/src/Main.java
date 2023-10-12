public class Main {
    public static void main(String[] args) {
            int [][] matriz = { {1,4,7,10,},
                                {90,120,42,70},
                                {3,1,-40,-7}};

            int i =0;

            while (i<3){
                for (int j=0; j<4; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
                i++;
            }
    }
}