import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = numeros.length -1;

        System.out.println("Coloque 10 numeros enteros: ");

        for (int i =0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int i=0; i<5; i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[9-i]);
        }

    }
}