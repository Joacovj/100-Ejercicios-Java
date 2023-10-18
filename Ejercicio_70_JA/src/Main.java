import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero de 8 digitos: ");

        int numero = sc.nextInt();
        char[] aNumero = Integer.toString(numero).toCharArray();

        for (int i=2; i < 6; i++){
            if (i == 5)
                System.out.print(aNumero[i]);
            else
                System.out.print(aNumero[i] + ", ");
        }


    }
}