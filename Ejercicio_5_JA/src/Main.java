import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado = 0;
        int cantidad = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los numeros positivos para sacar el promedio: ");

        double numero = sc.nextInt();

        while (numero != 0){
            if (numero >= 0) {
                cantidad++;
                resultado += numero;
            } else if (numero < 0) {
                System.out.println("El numero introducido no es un numero positivo, " +
                        "por favor introduzca otro numero");
            }

            numero = sc.nextInt();
        }

        resultado = resultado / cantidad;
        System.out.println("El promedio es de: " + resultado);
    }
}