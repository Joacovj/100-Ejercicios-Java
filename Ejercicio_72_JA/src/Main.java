import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra que no contenga simbolos ni numeros: ");

        String palabra = sc.next().toLowerCase();
        boolean contieneSimbolo = false;

        while(contieneSimbolo == false) {

            contieneSimbolo = true;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) > 'z' || palabra.charAt(i) < 'a') {
                    contieneSimbolo = false;
                }
            }

            if (contieneSimbolo == false){
                System.out.println("La palabra introducida contiene simbolos o numeros, " +
                        "introduzca otra palabra: ");
                palabra = sc.next().toLowerCase();
            }
        }

        System.out.println("La palabra ingresada "+"\""+ palabra +"\""+ " es valida");


    }
}