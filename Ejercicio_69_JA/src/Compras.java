import javax.swing.*;

public class Compras {


    public Compras() {
    }

    public static void situacionCompra(double total, double importe){
        if (importe < total){
            while (importe < total){
                importe = Double.parseDouble(JOptionPane.showInputDialog("La compra NO fue exitosa!\n Ingrese otro importe: "));
            }
        }

        if (importe == total){
            JOptionPane.showMessageDialog(null,"La compra fue exitosa!");
        }

        else {
            JOptionPane.showMessageDialog(null,"La compra fue exitosa, el cambio es de: " + (importe - total));

        }
    }


}

