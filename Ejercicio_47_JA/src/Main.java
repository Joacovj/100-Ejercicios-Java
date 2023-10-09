import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos a comprar: "));
        double total = precio * cantidad;

        if (cantidad >= 20){
            total = total - total * 0.15;
            double descuento = total *0.15;
            JOptionPane.showMessageDialog(null,"El total a pagar es de $" + total
                    + " para comprar " + producto
                    + "; al comprar 20 o mas productos se le realiza un descuento del 15% ahorrandole $" + descuento);
        }

        else {

            JOptionPane.showMessageDialog(null, "El total a pagar es de $" + total
                    + " para el producto: " + producto);
        }


    }
}