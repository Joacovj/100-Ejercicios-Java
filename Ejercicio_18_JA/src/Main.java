import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int numPiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piezas: "));
        double precioPieza = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la pieza: "));

        JOptionPane.showMessageDialog(null,"El total a pagar es de: $" +totalAPagar(numPiezas,precioPieza));



    }

    public static double totalAPagar(int numPiezas, double precioPieza){
        double descuento = 0.2;
        double total = numPiezas * precioPieza;

        if (numPiezas >= 100)
            return total - total * descuento;
        return total;
    }
}