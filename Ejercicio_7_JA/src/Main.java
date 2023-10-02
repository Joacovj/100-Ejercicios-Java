import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double promedioPositivo = 0;
        int positivos =0;
        double promedioNegativo = 0;
        int negativos = 0;
        int ceros =0;

        System.out.println("Introduzca los numeros: ");

        for (int i=0; i<10; i++){
            int temporal = sc.nextInt();

            if (temporal > 0) {
                promedioPositivo += temporal;
                positivos++;
            }
            else if (temporal < 0) {
                promedioNegativo += temporal;
                negativos++;
            }
            else ceros++;
        }
        promedioPositivo = promedioPositivo / positivos;
        promedioNegativo = promedioNegativo / negativos;

        System.out.println("El promedio de los positivos es de: " + promedioPositivo + "\nEl de los negativos: "
                + promedioNegativo + "\nLa cantidad de ceros es de: " + ceros );


    }
}