import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del 1er examen, 2do examen, practicas y tareas: ");
        double examen1 = sc.nextDouble();
        double examen2 = sc.nextDouble();
        double practicas = sc.nextDouble();
        double tareas = sc.nextDouble();

        double total = examen1 * 0.3 + examen2 * 0.4 + practicas * 0.2 + tareas * 0.1;

        System.out.println("Su calificacion total es de: " + total);


    }
}