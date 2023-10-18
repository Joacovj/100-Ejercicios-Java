import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero que tenga entre 4 y 12 digitos, y que la cantidad de digitos sea par: ");
        long numero = sc.nextLong();
        char [] aNumeros = Long.toString(numero).toCharArray();
        int length = aNumeros.length;

        while (length < 4 || length > 12 || length % 2 !=0){
            System.out.println("El numero introducido no es correcto, introduzca un numero valido: ");
             numero = sc.nextLong();
             aNumeros = Long.toString(numero).toCharArray();
             length = aNumeros.length;
        }

        length /= 2;

        System.out.println("Los numeros del centro son: " + aNumeros[length -1] +", " + aNumeros[length]);
    }
}