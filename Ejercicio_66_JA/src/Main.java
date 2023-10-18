import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que tendra el arreglo: ");
        int longitud = sc.nextInt();

        int [] numeros = new int[longitud];

        System.out.println("Introduzca " + longitud + " numeros enteros: ");

        for (int i=0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        numerosPrimos(numeros);
    }

    public static void numerosPrimos (int [] numeros){
        int contador =0;

        System.out.print("Los numeros primos del array son: ");

        for (int i=0; i< numeros.length; i++){
            int div = 0;

            for (int j=1; j <= numeros[i]; j++){
                if (numeros[i] % j == 0){
                    div++;
                }
            }

            if (div == 2){
                System.out.print(numeros[i] + ", ");
                contador++;
            }
        }

        System.out.print("\nLa cantidad de numeros primos en el array es de: " + contador);
    }
}