import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        mostrarReporte(2);
    }

    public static void mostrarReporte(int numeroLineas){
        System.out.println("El archivo tiene: " + numeroLineas + ((numeroLineas > 1) ? " lineas" : " linea"));
    }
}