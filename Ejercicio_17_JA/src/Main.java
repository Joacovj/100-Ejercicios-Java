import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque 5 numeros enteros de menor a mayor: ");

        for (int i=0; i<5; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        for (int i=0; i<numeros.length; i++){

            if (numero < numeros[i]){
                for (int j=numeros.length-2 ; j >= i; j--){
                    numeros[j+1] = numeros[j];
                }
                numeros[i] = numero;
                break;
            }
        }

        for (int numerox : numeros){
            System.out.println(numerox);
        }


    }
}