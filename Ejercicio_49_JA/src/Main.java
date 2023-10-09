import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero del 1 al 10: "));
        boolean dentroRango = false;

        while (numero <1 || numero >10){
            numero = Double.parseDouble(JOptionPane.showInputDialog("El numero introducido esta fuera del rango y el " +
                    "boolean es " + dentroRango + " por favor introduzca un numero del 1 al 10: "));
        }

        dentroRango = true;
        JOptionPane.showMessageDialog(null,"El numero introducido es: " + numero
        + " y el boolean es " + dentroRango);
    }
}