import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++)     {
                System.out.println("Introduzca un numero entero en la fila " + (i+1) + " columna " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++)     {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}