import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = num1;

        if (num2 > num1 && num2 > num3)
            max = num2;
        else if (num3 > num1 && num3 > num2) {
            max = num3;
        }

        int i = max;

        while (i % num1 != 0 || i % num2 != 0 || i % num3 != 0 ){
            i++;
        }

        System.out.println("El mcm entre " + num1 + ", " + num2 + ", " + num3 + " es: " + i);
    }
}