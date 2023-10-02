import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = 1;
        double kilo = 0;
        double precio = 0;
        double importe = 0;
        int contador =0;
        double facturacionTotal = 0;
        ArrayList<Double> facturas = new ArrayList<>();

        System.out.println("\nColoque 0 si desea finalizar: ");

        while (sc.nextInt() != 0) {
            System.out.println("Ingrese el codigo del producto: ");
            codigo = sc.nextInt();
            System.out.println("Ingrese la cantidad de kilos: ");
            kilo = sc.nextDouble();
            System.out.println("Ingrese el precio por kilo: ");
            precio = sc.nextDouble();

            importe = precio * kilo;

            facturas.add(importe);
            System.out.println("\nDesea finalizar?");
            contador++;

            if (contador >= 5){
                for (int i =0; i < facturas.size(); i++){
                    if (facturas.get(i) > 1000)
                        System.out.println("Las facturas que pasaron los $1000 son la factura:  " + (i+1) + " con una venta de: $"
                                + facturas.get(i));

                    facturacionTotal += facturas.get(i);
                    contador = 0;
                }
                System.out.println("La facturacion total es de: " + facturacionTotal);

            }
        }

    }
}