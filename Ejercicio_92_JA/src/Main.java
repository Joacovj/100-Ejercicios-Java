import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate year2000 = LocalDate.of(2000, 1, 1);
        LocalDate fechaActual = LocalDate.now();

        Period diferenciaFechas = Period.between(year2000, fechaActual);

        System.out.println(diferenciaFechas);
        System.out.println("Year: " + diferenciaFechas.getYears());
        System.out.println("Meses: " + diferenciaFechas.getMonths());
        System.out.println("Dias: " + diferenciaFechas.getDays());
    }
}