import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean multiplo = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");

        if (sc.nextDouble() % 3 == 0){
            multiplo = true;
            System.out.println("El numero introducido es multiplo de 3: " + multiplo);
        }
        else
            System.out.println("El numero introducido NO es multiplo de 3: " + multiplo);

    }
}