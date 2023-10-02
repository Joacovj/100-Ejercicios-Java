import javax.swing.*;
import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        double horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas: "));
        JOptionPane.showMessageDialog(null,"El total es de: $" + precioEstacionamiento(horas));
    }

    public static double precioEstacionamiento (double horas){
        int dias = 0;
        double restoHoras = 0;
        double precioResto =0;

        if (horas < 3)
            return horas * 20;

        if (horas >=3 && horas <= 24) {
            if (horas * 15 >= 250)
                return 250;
            return horas * 15;
        }

        else {
                dias = (int) (horas / 24);
                restoHoras = horas % 24;
                precioResto = restoHoras *15;

                if (precioResto >= 250){
                    precioResto = 250;
                }

                return dias * 250 + precioResto;
            }
    }
}