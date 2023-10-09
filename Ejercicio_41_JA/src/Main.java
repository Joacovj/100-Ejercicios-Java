import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad en km/h: ");
        double velocidad = sc.nextDouble();
        double total = 0;

        total = (velocidad * 1000) / 3600;

        System.out.println("La velocidad es de " + total + "m/s");
    }
}