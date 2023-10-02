import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int mayor = numeros[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los 5 numeros: ");

        for (int numero : numeros){
            numero = sc.nextInt();

            if (mayor < numero)
                mayor = numero;
        }

        System.out.println("El mayor es: " + mayor);
    }
}