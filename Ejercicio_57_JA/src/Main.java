import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int repeticion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del array: ");

        int longitud = sc.nextInt();
        int [] numeros = new int[longitud];

        System.out.println("Ingrese " + longitud + " numeros enteros: ");

        for (int i=0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int i=0; i< numeros.length; i++){
            int numero = numeros[i];
            repeticion = 0;

            for (int j=0; j< numeros.length - 1; j++){
                if (numero == numeros[j] && i != j){
                    repeticion++;
                }
            }

            if (repeticion != 0)
                repeticion++;


            System.out.println("El numero " + numero + " se repite: " + repeticion + " veces");


        }
    }
}