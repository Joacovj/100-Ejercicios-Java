import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del vendedor: ");
        String nombre = sc.next();

        System.out.println("Introduzca la cantidad de computadoras vendidas: ");
        int ventasCompus = sc.nextInt();

        System.out.println("Introduzca el valor total de las ventas realizadas en el mes: ");
        double ventasTotal = sc.nextDouble();

        double salario = 5000 + 200 * ventasCompus + ventasTotal *0.05;

        System.out.println("El salario total es de " + nombre + " es de: $" + salario);


    }
}