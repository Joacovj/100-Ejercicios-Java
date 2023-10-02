import java.util.Random;

public class VentasGeneradasAutomaticamente {
    public String [] ventas = new String[60];
    boolean flag = true;
    int i=0;
    int contador = 1;
    Random rn = new Random();


    public void generadorDeVentas(){
        while( i < ventas.length){

            if (flag == true) {
                ventas[i] = "Venta " + String.valueOf(contador);
                flag = false;
                contador++;
                i++;
            }
            System.out.println(ventas[i-1]);

            if (flag == false) {
                ventas[i] = String.valueOf(rn.nextDouble(4000));
                flag = true;
                i++;
            }

            System.out.println(ventas[i-1]);

        }
    }

    public void mostrarVentasGrandes (){
        System.out.println("\nLas ventas mayores a $2.000 son de: ");
        for (int j=1; j< ventas.length; j++){
            if (Double.parseDouble(ventas[j]) > 2000) {
                System.out.println( ventas[j]);
            }
            j++;
        }
    }


}
