import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] calificaciones = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros enteros del 5 al 10: ");
        for (int i=0; i< calificaciones.length; i++){
            calificaciones[i] = sc.nextInt();
        }

        validar(calificaciones);
        System.out.println("El promedio es de: " + promedio(calificaciones));
    }

    public static boolean validar (int [] calificaciones){
        boolean valido = true;

        for (int i=0; i< calificaciones.length; i++){
            if (calificaciones[i] < 5 || calificaciones[i] > 10) {
                valido = false;
                System.out.println("El numero " + calificaciones[i] + " en la posicion " + i + " no es valido");
            }
        }

        return valido;
    }

    public static double promedio (int [] calificaciones){
        double total = 0;
        for (int calificacion : calificaciones)
            total += calificacion;

        total = total / calificaciones.length;

        return total;
    }
}