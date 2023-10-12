import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: "));
        double sueldo = 0;

        if (horas > 48) {

            if (horas > 56){
                sueldo = 48 * 40 + 8 * 80;
                horas = horas - 56;
                sueldo += 120 * horas;
            }

            else {
                sueldo = 48*40;
                horas = horas - 48;
                sueldo += horas * 80;
            }
        }

        else {
            sueldo = horas * 40;
        }

        JOptionPane.showMessageDialog(null,"El sueldo es de: $" + sueldo);
    }
}