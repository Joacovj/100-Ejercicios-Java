import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i=0; i <= 10; i++){
            numeros.add(i);
        }

        // Recorrido a traves de ciclio for estandar
        System.out.println("\nRecorrido con ciclo for estandar: ");

        for (int i=0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }

        Iterator<Integer> iterador = numeros.iterator();
        System.out.println("\n\nRecorrido con iterador: ");
        while (iterador.hasNext()){
            System.out.print(iterador.next() + " ");
        }

        System.out.println("\n\nRecorrido con ciclo for mejorado: ");
        for (Integer numero:
             numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nRecorrido con metodo forEach: ");
        numeros.forEach(numero -> System.out.print(numero + " "));

        System.out.println("\n\nRecorrido con metodo forEach especificando una funcion nombrada: ");
        numeros.forEach(System.out::println);
        System.out.println();
        numeros.forEach(Main::imprimirNumero);
    }

    public static void imprimirNumero(Integer numero){
        System.out.print(numero + " ");
    }
}