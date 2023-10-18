import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese longitud del arreglo: ");
        int longitud = sc.nextInt();

        int [] numeros = new int[longitud];


        System.out.println("Ingrese " + longitud + " numeros enteros: ");

        for (int i=0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        ordenarArreglo(numeros);




    }

    public static void ordenarArreglo(int [] numeros) {
        int temp = 0;

        for (int i = 0; i < numeros.length; i++){

            for (int j = 0; j< numeros.length-1; j++){

                if (numeros [j] > numeros[j+1]){
                    temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }

        for (int numero : numeros)
            System.out.println(numero);
    }
}