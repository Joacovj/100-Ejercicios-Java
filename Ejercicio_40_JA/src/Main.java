import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double dPromedio = Double.parseDouble(JOptionPane.
                showInputDialog("Ingrese el promedio de calificaciones del alumno: "));

        int beca = 0;

        if (dPromedio < 0 || dPromedio > 10){
            boolean incorrecto = false;

            while (incorrecto == false){
                JOptionPane.showMessageDialog(null,"El numero introducido es incorrecto, por favor introduzca un numero del 0 al 10");
                dPromedio = Double.parseDouble(JOptionPane.
                        showInputDialog("Ingrese el promedio de calificaciones del alumno: "));

                if (dPromedio >= 0 && dPromedio <=10)
                    incorrecto = true;
            }
        }

        int promedio = (int) dPromedio;

        if (promedio <6)
            JOptionPane.showMessageDialog(null,"Esta reprobado, no recibira una beca");

        else {
            switch (promedio) {
                case 10:
                    beca = 100;
                    break;
                case 9:
                    beca = 100;
                    break;
                case 8:
                    beca = 60;
                    break;
                case 7:
                    beca = 30;
                    break;
                case 6:
                    beca = 30;
                    break;

            }
            JOptionPane.showMessageDialog(null, "La beca es de: $" + beca);
        }

    }
}