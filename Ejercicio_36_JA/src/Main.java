import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] trimestre = new int [3];
        double [] alumnos = new double[5];
        double [] promedioAlumno = new double[5];
        int cont = 0;

        for (int i=0; i<trimestre.length; i++){
            for (int j=0; j< alumnos.length; j++){

                System.out.println("Introduzca la calificacion del alumno " + (j+1) + " en el trimestre "
                        + (i+1) + ": ");

                alumnos[j] = sc.nextDouble();
                promedioAlumno[j] += alumnos[j];

                trimestre[i] += alumnos[j];
                cont++;
            }

            trimestre[i] = trimestre[i] / 5;

            System.out.println("\nEl promedio del grupo en el trimestre " + (i+1) + " es de: " + trimestre[i]+"\n");
        }

        for (int i = 0; i< promedioAlumno.length; i++){
            promedioAlumno[i] = promedioAlumno[i] / 3;
        }

        System.out.println("Ingrece la posicion del alumno del que desea obtener el promedio: ");

        System.out.println(promedioAlumno[sc.nextInt()]);





    }
}