import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        int excelencia = 0;

        System.out.println("\nIntroduzca la nota de los 6 alumnos: ");

        for (int i=0; i<6; i++){
            float temp = sc.nextFloat();

            if (temp < 7)
                reprobados++;

            else if (temp >= 7) {
                if (temp >= 9)
                    excelencia++;
                aprobados++;
            }


        }

        System.out.println("La cantidad de aprobados es de: " + aprobados + " \ncon excelencia: " + excelencia
                + "\nlos reprobados son: " + reprobados);
    }
}