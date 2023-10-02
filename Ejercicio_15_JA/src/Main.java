import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numerosA = new int[12];
        int [] numerosB = new int[12];
        int [] numerosC = new int[24];
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int j = 0;

        System.out.println("Introduzca los 12 numeros enteros del 1er arreglo: ");

        for (int i=0; i < numerosA.length; i++){
            numerosA[i] = sc.nextInt();
        }

        System.out.println("Introduzca los 12 numeros enteros del 2do arreglo: ");

        for (int i=0; i < numerosB.length; i++){
            numerosB[i] = sc.nextInt();
        }

        for (int i=0; i < numerosC.length -3 ; i++){
            if (contador > 2){
                i = i+3;
                contador = 0;
            }

            numerosC[i] = numerosA[j];
            numerosC[i+3] = numerosB[j];
            contador++;
            j++;
        }

        for (int numero : numerosC){
            System.out.print(numero + ", ");
        }

    }
}