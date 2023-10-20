import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el texto a validar sin simbolos o numeros: ");
        String texto = sc.nextLine();
        boolean contieneSimbolos = true;

        while (contieneSimbolos == true){

            contieneSimbolos = false;

            for (int i=0; i < texto.length(); i++){

                if (texto.charAt(i) < 'A' || texto.charAt(i) > 'Z')
                    if (texto.charAt(i) < 'a' || texto.charAt(i) > 'z')
                        if (texto.charAt(i) != ' '){
                            contieneSimbolos = true;
                        }
            }

            if (contieneSimbolos == true){
                System.out.println("El texto ingresado es invalido ya que contiene simbolo o numeros, " +
                        "introduzca un texto sin simbolos o numeros: ");
                texto = sc.nextLine();
            }
        }

        System.out.println("El texto introducido " + "\""+ texto +"\""+ " es valido: ");


    }
}