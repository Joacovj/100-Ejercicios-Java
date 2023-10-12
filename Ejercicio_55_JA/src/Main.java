import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] matriz = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Introduzca 4 numeros enteros en la fila " + (i+1));
            for (int j=0; j<4; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<3; i++){
            System.out.println();
            for (int j=0; j<4; j++){
                System.out.print(matriz[i][j] + "\t");;
            }
        }
    }
}