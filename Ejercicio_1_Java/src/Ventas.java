import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ventas {
    int cantidad;
    ArrayList<Double> ventas = new ArrayList<>();

    public void Ventas (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de ventas: ");
        this.cantidad = sc.nextInt();
    }

    public void dineroVentas(){
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < cantidad; i++) {
            System.out.println("Ingrese el dinero: ");
            double dineroScan = sc.nextDouble();
            ventas.add(dineroScan);
        }
    }

    public void mostrarTodasVentas(){
        for (double venta : ventas){
            System.out.println(venta);
        }
    }

    public void mostrarVentasMayores(){
        for (double venta : ventas){
            if (venta > 2000)
            System.out.println(venta);
        }
    }


}
