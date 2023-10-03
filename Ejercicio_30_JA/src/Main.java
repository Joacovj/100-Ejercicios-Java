import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de numeros que tendra el arreglo: ");
        int longitudArreglo = sc.nextInt();
        int [] numeros = new int[longitudArreglo];

        System.out.println("Introduzca los numeros enteros del arreglo: ");

        for (int i=0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        determinarOrdenArreglo(numeros);


    }

    public static void determinarOrdenArreglo (int [] numeros){
        int contador = 0;

        for (boolean control = false; !control;) {

            for (int i = 0; i < numeros.length - 1; i++) {

                if (numeros[i] > numeros[i + 1]) {
                    System.out.println("El arreglo esta desordenado");
                    control = true;
                    break;
                }

                if (numeros[i] == numeros[i+1]){
                    contador++;

                    if (contador == numeros.length-1){
                        System.out.println("Todos los numeros son iguales");
                        control = true;
                    }
                }
            }

            if (control == false) {
                System.out.println("El arreglo esta ordenado");
                control = true;
            }
        }
    }
}