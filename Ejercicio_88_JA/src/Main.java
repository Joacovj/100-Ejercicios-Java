import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Obtencion de hora actual
        LocalTime horaActual = LocalTime.now();

        System.out.println("Hora actual: " + horaActual);

        // Obtencion de la fecha actual
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Fecha actual: " + fechaActual);

        // Obtencion de ambs
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        System.out.println("Fecha y hora actual: " + fechaHoraActual);

    }
}