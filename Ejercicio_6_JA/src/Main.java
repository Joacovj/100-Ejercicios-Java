import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los numeros: ");

        int total = 1;
        int contador = 0;
        

        for (int i =0; i<5; i++){
            int numero = sc.nextInt();

            if (numero % 2 != 0) {
                total *= numero;
                contador++;
            }
            if (contador == 10){
                break;
            }
            else
                i--;
        }

        System.out.println("El total es de: " + total);


    }
}