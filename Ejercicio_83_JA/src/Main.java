public class Main {
    public static void main(String[] args) {
        int[][] A = {{3,2,3} , {5,9,8}};
        int[][] B = {{4,7} , {9,3} , {8,1}};

        Matriz matriz = new Matriz();

        int[][] resultado = matriz.multiplicar(A,B);

        for (int i=0; i< resultado.length; i++){
            for (int j = 0; j<resultado[0].length; j++){
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }


}