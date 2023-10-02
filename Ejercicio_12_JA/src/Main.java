import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 5 numeros: ");

        for (int i = numeros.length -1; i > -1; i--){
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros)
            System.out.println(numero);
    }
}