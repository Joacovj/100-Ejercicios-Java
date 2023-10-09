import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que tendra el array: ");
        int longitud = sc.nextInt();
        int [] numeros = new int[longitud];

        System.out.println("Ingrese " + longitud + " numeros enteros: ");

        for (int i=0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("La suma de los numeros es de: " + sumaNumeros(numeros));
        System.out.println("El promedio es de: " + promedio(numeros));
        System.out.println("El mayor es de: " + mayorNumero(numeros));
        System.out.println("El menor es de: " + menorNumero(numeros));

    }

    public static int sumaNumeros(int [] numeros){
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }

        return suma;
    }

    public static double promedio(int [] numeros){
        double suma = sumaNumeros(numeros);

       double total = suma / numeros.length;

        return total;
    }

    public static int mayorNumero(int [] numeros){
        int mayor = numeros[0];

        for (int numero : numeros){
            if (numero > mayor)
                mayor = numero;
        }

        return mayor;
    }

    public static int menorNumero(int [] numeros){
        int menor = numeros[0];

        for (int numero : numeros){
            if (numero < menor)
                menor = numero;
        }

        return menor;
    }

}