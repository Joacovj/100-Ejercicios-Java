import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.ofDays(317);

        LocalDate sumaFechas = fechaActual.plus(periodo);

        System.out.println("Actual: " + fechaActual);
        System.out.println("Fecha Nueva: " + sumaFechas);

        Period periodo1 = Period.ofDays(317);
        LocalDate restarFechas = fechaActual.minus(periodo1);

        System.out.println("Actual: " + fechaActual);
        System.out.println("Fecha Nueva: " + restarFechas);


    }
}