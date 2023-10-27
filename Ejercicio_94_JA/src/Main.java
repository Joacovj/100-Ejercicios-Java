import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Conversion desde java.util.Date
        Date fecha = new Date();
        System.out.println(fecha);

        LocalDateTime fechaNueva = LocalDateTime.ofInstant(fecha.toInstant(), ZoneId.systemDefault());
        System.out.println(fechaNueva);

        // Conversion desde java.util.Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("\n" + calendar);

        fechaNueva = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());

        System.out.println("Fecha Nueva: " + fechaNueva);
    }
}