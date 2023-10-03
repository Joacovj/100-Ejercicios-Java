import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca 2 numerso enteros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("El mayor es: " + maximo(a,b));
    }

    public static int maximo(int a, int b){
        return a > b ? a : b;
    }
}