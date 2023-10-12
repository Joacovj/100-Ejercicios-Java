import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones: ");

        int longitud = sc.nextInt();
        int[] notasAlumnos = new int[longitud];

        rellenarArreglo(notasAlumnos);
        System.out.println("El promedio es de: " + promedio(notasAlumnos));
        aprobadosYReprobados(notasAlumnos);
        porcentajeAprobados(notasAlumnos);
    }

    public static void rellenarArreglo(int[] notas) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota numero " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
    }

    public static double promedio(int[] notas) {
        double total = 0;

        for (int nota : notas) {
            total += nota;
        }

        total = total / notas.length;

        return total;
    }

    public static void aprobadosYReprobados(int[] notas) {
        int aprobados = 0;
        int reprobados = 0;

        for (int nota : notas) {
            if (nota >= 7)
                aprobados++;
            else
                reprobados++;
        }

        System.out.println("El numero de aprobados es de: " + aprobados);
        System.out.println("El numero de reprobados es de: " + reprobados);
    }

    public static void porcentajeAprobados(int[] notas) {
        int aprobados = 0;

        for (int nota : notas) {
            if (nota >= 7)
                aprobados++;
        }
        double porcentaje = (100 * aprobados) / notas.length;

        System.out.println("El porcentaje de aprobados es de: " + porcentaje  + "%");

    }
}