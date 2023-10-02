import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros enteros: ");

        for (int i=1; i< numeros.length; i++){
            numeros[i] = sc.nextInt();

            if (i == numeros.length - 1) {
                numeros[0] = sc.nextInt();
                break;
            }

        }

        for (int numero : numeros){
            System.out.println(numero);
        }

    }
}