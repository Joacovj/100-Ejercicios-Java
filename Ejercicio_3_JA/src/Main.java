import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de piezas de pan que desea comprar: ");

        int piezas = sc.nextInt();

        if (piezas <= 50)
            System.out.println("El total es de: $" + piezas * 5);
        else if (piezas > 50 && piezas <=100) {
            System.out.println("El total es de: $" + piezas * 4.5);
        }
        else
            System.out.println("El total es de: $" + piezas * 4);
    }
}