import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numeros = 0;
        boolean control = false;

        while (control == false) {
            control = true;

            try {
                numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de 3 digitos: "));
            } catch (NumberFormatException e) {
                control = false;
                JOptionPane.showMessageDialog(null,"No ha introducido un numero");
            }
        }

        char [] cNumeros = new char[3];
        String sNumeros = String.valueOf(numeros);

        while (sNumeros.length() != 3 || control == false){
            control = true;

            try {
                numeros = Integer.parseInt(JOptionPane.showInputDialog("El numero introducido no es un numero o " +
                        "no tiene 3 digitos, por favor ingrese un numero de 3 digitos: "));
                sNumeros = String.valueOf(numeros);
            }catch (NumberFormatException e) {
                control = false;
                JOptionPane.showMessageDialog(null,"No ha introducido un numero");
            }
        }

        for (int i=0; i<cNumeros.length; i++){
            cNumeros[i] = sNumeros.charAt(i);
        }

        JOptionPane.showMessageDialog(null,"{" + cNumeros[0]
                + ", " + cNumeros [1] + ", " + cNumeros[2] + "}");
    }
}