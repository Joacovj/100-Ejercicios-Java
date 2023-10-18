import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = num1;

        if (num2 > num1)
            max = num2;

        int i = max;

        while (i % num1 != 0 || i % num2 !=0){
            i++;
        }

        System.out.println("El minimo comun multiplo de " + num1 +", " + num2+ " es: " + i);







    }
}