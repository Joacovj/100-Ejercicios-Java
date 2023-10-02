import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            int numeroControl = Integer.parseInt(JOptionPane
                    .showInputDialog("Coloque el numero de control: "));
            float calificacion = Float.parseFloat(JOptionPane
                    .showInputDialog("Introduzca la calificacion del alumno: "));

            if (calificacion < 7)
                JOptionPane.showMessageDialog(null,
                        "El alumno " + numeroControl + " a reprobado con " + calificacion);
        }
    }
}