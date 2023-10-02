import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuántos sueldos desea ingresar?"));
        double sueldo = 0;
        double sueldoMayor = 0;

        System.out.println("Introduzca los sueldos: ");

        for (int i=0; i<cantidad; i++){
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Intrduzca el sueldo"));
            if (sueldo > sueldoMayor)
                sueldoMayor = sueldo;
        }

        JOptionPane.showMessageDialog(null,"El mayor sueldo es de: $" + sueldoMayor);

    }
}