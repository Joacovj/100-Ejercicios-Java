import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        double [] numeros = {0, 1, 23D/5, 100.2345573, 10000};

        NumberFormat nf = NumberFormat.getInstance();

        nf.setMinimumIntegerDigits(4);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        for (double numero : numeros){
            System.out.printf("%f -> %s\n", numero, nf.format(numero));
        }
    }
}