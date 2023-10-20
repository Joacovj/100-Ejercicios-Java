import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 10);
        int intentos = 3;

        while (intentos > 0){
           int numero = Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero entero entre 0 a 9, le quedan "
                   + intentos + " intentos: " ));

           if (numero == numeroSecreto){
               JOptionPane.showMessageDialog(null,"Ha adivinado!! el numero secreto era: "
                       + numeroSecreto);
               break;
           }
            intentos--;
        }

        if (intentos == 0){
            JOptionPane.showMessageDialog(null,"Se ha quedado sin intentos, " +
                    "el numero secreto era " + numeroSecreto + " mejor suerte para la proxima!");
        }
    }
}