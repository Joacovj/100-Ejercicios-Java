import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "Holanda randa fanda panda zanda";
        cadenaTexto(texto);
    }

    public static int cadenaTexto(String texto){
        int contador = 0;
        int pos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el caracter que desea buscar: ");
        char buscar = sc.next().charAt(0);
        pos = texto.indexOf(buscar);

        while (pos != -1){
            contador++;
            pos = texto.indexOf(buscar,pos+1);
        }

        System.out.println("El caracter se repite " + contador + " veces");
        return contador;
    }
}