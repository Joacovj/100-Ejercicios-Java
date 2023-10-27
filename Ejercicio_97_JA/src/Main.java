import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> enteros = new Vector<>(10);

        for(int i=0; i<1000000; i++){
            enteros.add(i);
        }


    }
}