import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Conversion cadena caracteres a fecha
        String cadenaFecha = "1984-05-21";
        LocalDate fecha1 = LocalDate.parse(cadenaFecha);
        System.out.println(fecha1);

        // Conversion cadena caracteres fecha hora a fecha
        cadenaFecha = "1984-05-21T02:31:29";
        LocalDateTime fecha2 = LocalDateTime.parse(cadenaFecha);
        System.out.println("\n" + fecha2);

        // Conversion cadena caracteres con formato a fecha
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM uuuu");

        cadenaFecha = "02 oct 1964";
        LocalDate fecha3 = LocalDate.parse(cadenaFecha, dtf);
        System.out.println("\n" + fecha3);
    }
}