import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Array List
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(Double.valueOf(5.3));
        numeros.add(Double.valueOf(7.3));
        numeros.add(Double.valueOf(8.3));

        // Hash Map
        HashMap<Integer, String> nombres = new HashMap<>();
        nombres.put(1,"Notepad++");
        nombres.put(2,"IntelIj");
        nombres.put(3,"NetBeans IDE");

        // Hash Set
        HashSet<Integer> numerosEnteros = new HashSet<>();
        numerosEnteros.add(5);
        numerosEnteros.add(9);
        numerosEnteros.add(7);
        numerosEnteros.add(5);


    }
}