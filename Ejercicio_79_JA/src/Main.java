import java.text.NumberFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RomanNumberFormat nf = new RomanNumberFormat();
        int year = LocalDate.now().getYear();

        System.out.printf("%d -> %s", year, nf.format(year));
    }
}