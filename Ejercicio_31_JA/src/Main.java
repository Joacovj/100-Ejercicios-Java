import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        int posicion = 0;

        System.out.println("Introduzca 10 numeros enteros: ");

        for (int i=0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("Introduzca la posicion del numero que desea borrar: ");

        posicion = sc.nextInt();

        for (int i=0; i<9; i++){

            if (i==posicion){
                int temp = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = temp;
                posicion++;
            }
        }

        for (int i =0; i< numeros.length -1; i++)
            System.out.print(numeros[i] + "\t");
    }
}