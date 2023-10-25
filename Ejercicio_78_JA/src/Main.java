import java.util.BitSet;

public class Main {
    private static final String [] Meses = {
            "Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre",
    };
    public static void main(String[] args) {
        System.out.println("Numero de los meses: ");

        for (int i = 1; i <= Meses.length; i++) {
            System.out.println("Numero mes: " + i);
        }

        System.out.println("\nMeses del año: ");
        for (int i = 0; i < Meses.length; i++) {
            System.out.println("Mes: " + Meses[i]);
        }

        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(4);
        bitSet.set(9);

        System.out.println("\nSecuencia discontinua: ");

        for (int i = 0; i < Meses.length; i++) {
            if (bitSet.get(i)) {
                System.out.println("Mes: " + Meses[i]);
            }
        }
    }
}