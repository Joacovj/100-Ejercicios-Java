import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de los 2 catetos: ");
        double cateto1 = sc.nextDouble();
        double cateto2 = sc.nextDouble();

        double hipotenusa  =Math.sqrt ( Math.pow(cateto1,2) + Math.pow(cateto2,2) );

        System.out.println("La hipotenusa vale: " + hipotenusa);

    }
}