import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Introduzca los numeros a sumar: ");
        int numero = sc.nextInt();

        while (numero != 0){
            total += numero;
            numero = sc.nextInt();
        }

        System.out.println("El total es: " + total);
    }
}