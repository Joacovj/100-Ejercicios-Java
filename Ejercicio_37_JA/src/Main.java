import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio normal de la inscripcion: $"));
       int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del alumno: "));
       double descuento = 0.5;


       if (edad > 7 && edad < 14){

           String tieneHermanos = JOptionPane.showInputDialog("Tiene hermano/s estudiando en esta escuela? ");

           if (tieneHermanos.equalsIgnoreCase("si"))
               JOptionPane.showMessageDialog(null,"El precio es de: "
                       + (precio * descuento) );

           else
               JOptionPane.showMessageDialog(null,"El precio es de: $" + precio);
       }

       else
           JOptionPane.showMessageDialog(null,"El precio es de: $" + precio);
    }
}