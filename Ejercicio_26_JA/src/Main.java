import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arreglo = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros enteros: ");
        for (int i=0; i< arreglo.length; i++){
            arreglo[i] = sc.nextInt();
        }

        ordenarArreglo(arreglo);

        for (int arr: arreglo){
            System.out.print(arr + " ");
        }
    }

    public static void ordenarArreglo(int [] arreglo){

        int contador = 0;


        for (boolean ordenado = false; !ordenado;){

            for (int i =0; i<arreglo.length-1; i++){

                if (arreglo[i] > arreglo[i+1]){
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = temp;
                    contador++;

                }
            }

            if (contador == 0)
                ordenado = true;

            contador =0;
        }
    }
}