import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        int [] binario = new int[8];
        int cont = binario.length -1;

        System.out.println("Introduzca un numero decimal del 0 al 255: ");
        numero = sc.nextInt();

        if (numero < 0 || numero > 255)
            System.out.println("El numero que ha introducido no es valido");

        else {

            while (numero !=0){
                binario[cont] = numero % 2;
                numero = numero / 2;
                cont--;
            }

            System.out.println("El numero en binario es: ");

            for (int bi : binario){
                System.out.print(bi + " ");
            }


        }




    }
}