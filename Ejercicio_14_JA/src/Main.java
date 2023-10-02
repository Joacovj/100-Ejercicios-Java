import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arrA = new int[10];
        int [] arrB = new int[10];
        int [] arrC = new int[20];
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los 10 numeros del primer Array: ");
        for (int i=0; i<arrA.length; i++){
            arrA[i] = sc.nextInt();
        }

        System.out.println("Introduzca los 10 numeros del segundo Array: ");

        for (int i=0; i<arrB.length; i++){
            arrB[i] = sc.nextInt();
        }

        for (int i=0; i< arrC.length;i++){
            arrC[i]= arrA[contador];
            arrC[i+1] = arrB[contador];
            i++;
            contador++;
        }

        System.out.println("El tercer array es: ");

        for (int numero: arrC) {
            System.out.print(numero + ", ");
        }


    }
}