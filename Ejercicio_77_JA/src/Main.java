public class Main {
    public static void main(String[] args) {
        String binario = "100111";
        int [] bases = {2, 8, 10, 16, 36};

        System.out.println("Conversion binario a diferentes bases: ");

        for (int base : bases){
            System.out.printf("%s => %d\n", binario, Integer.valueOf(binario, base));
        }

        System.out.println("\nDecimal a distintas bases: ");
        int numero = 42;

        for (int base: bases){
            System.out.printf("%d => %s\n", numero, Integer.toString(numero, base));
        }
    }
}