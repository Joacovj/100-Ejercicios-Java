import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));

        System.out.println(LocalDate.parse("24/12/2400", dtf));

        dtf = DateTimeFormatter.ofPattern("d M, yyyy h:mm a");

        System.out.println(ZonedDateTime.now().format(dtf));
    }
}